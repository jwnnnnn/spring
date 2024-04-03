package com.yedam.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Restaurant {
	
	//필드선언
	private Chef chef;
	
	public void run() {
		chef.cooking();
	}
	
	//인스턴스를 생성하자마자 setter를 같이 돌려버림
	//getter setter 등록을 해야  applicationContext.xml의 프로퍼티가 먹힘.
	@Autowired
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	public Chef getChef() {
		return chef;
	}
	
	
}
