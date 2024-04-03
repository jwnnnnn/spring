package com.yedam.spring.xml;

public class Restaurant {
	
	//필드선언
	private Chef chef;
	
	public void run() {
		chef.cooking();
	}
	
	
	//getter setter 등록을 해야  applicationContext.xml의 프로퍼티가 먹힘.

	public void setChef(Chef chef) {
		this.chef = chef;
	}
	public Chef getChef() {
		return chef;
	}
	
	
}
