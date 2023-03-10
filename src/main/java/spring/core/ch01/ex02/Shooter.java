package spring.core.ch01.ex02;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import spring.core.ch01.ex01.Gun;

//record(신기술)로 부족한것은 lombok으로 만듦.
//setter method의 생성을 lombok에게 맡김.
@Setter
//기본생성자의 생성을 lombok에게 맡김.
@NoArgsConstructor
//dependency 2개이상을 parameter로 받는 생성자를 lombok이 만들어줌.
@AllArgsConstructor
public class Shooter {
	private String shooterName;
	private Gun gun;
	
	public void fire() {
		System.out.print(shooterName + ": ");
		gun.fire();
	}
}