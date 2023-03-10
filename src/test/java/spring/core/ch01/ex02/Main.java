package spring.core.ch01.ex02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		//ctx라는 container의 생성.
		ApplicationContext ctx = new ClassPathXmlApplicationContext("app.xml", Main.class);
		
		//getBean으로 가져오는 data type은 object이므로,
		//Shooter.class을 이용해 Shooter type으로 casting한다.
		Shooter shooter1 = ctx.getBean("shooter1", Shooter.class);
		Shooter shooter2 = ctx.getBean("shooter2", Shooter.class);
		
		shooter1.fire();
		shooter2.fire();
	}
}
