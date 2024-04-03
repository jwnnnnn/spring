package com.yedam.spring.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainExample {
	
	//실행할 클래스
	public static void main(String[] args) {
		ApplicationContext ctx
		= new GenericXmlApplicationContext("classpath:applicationContext.xml");
		// GenericXmlApplicationContext => 컨테이너 관리자  //applicationContext.xml 컨테이너가 활용할 내용
		//실행하면 Chef.java 실행.
		Restaurant res = (Restaurant)ctx.getBean(Restaurant.class); //메인에서 빈을 들고 올 때 applicationContext.xml 넘겨줌
						//객체가 반환되는 타입이 object 타입이라서 형변환.
										//getBean 컨테이너 안에 있는 bean에 대해서 위치를 알려줌.(메모리 주소)
												//레스토랑 클래스로 불러옴.
		
		res.run();
	}
}
