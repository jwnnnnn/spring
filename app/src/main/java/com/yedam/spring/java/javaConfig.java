package com.yedam.spring.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //bin의 정보를 들고있는 클래스
public class javaConfig { // 일반적으로 설정하는 클래스 = (java)Config
	
	// 이름을 붙이고 싶으면 name 속성 | name = "chf"
	@Bean(name = "chf") 
	public Chef chef() { //bean은 메서드를 사용해서 인스턴스를 실행
		return new Chef();
	}
	//
	@Bean
	public Restaurant restaurant (Chef chef) {
		Restaurant res = new Restaurant();
		res.setChef(chef);
		return res;
	}
}
