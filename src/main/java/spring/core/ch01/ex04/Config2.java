package spring.core.ch01.ex04;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring.core.ch01.ex01.Rifle;

@Configuration
public class Config2 {
	//IoC 내용으로 rifle Bean을 생성한다.
	@Bean
	public Rifle rifle() {
		return new Rifle();
	}
}
