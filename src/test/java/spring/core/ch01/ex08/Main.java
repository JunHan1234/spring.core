package spring.core.ch01.ex08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class); 
		
		Lion lion1 = ctx.getBean(Lion.class);
		Lion lion2 = ctx.getBean(Lion.class);
		
		Leopard leopard1 = ctx.getBean(Leopard.class);
		Leopard leopard2 = ctx.getBean(Leopard.class);
		
		Lapin lapin1 = ctx.getBean(Lapin.class);
		Lapin lapin2 = ctx.getBean(Lapin.class);
		
		System.out.println("lion: " + (lion1 == lion2)); //singleton
		System.out.println("leopard: " + (leopard1 == leopard2)); //singleton
		System.out.println("lapin: " + (lapin1 == lapin2)); //prototype scope. getBean call마다, 매번 새로운 bean 생성
	}
}
