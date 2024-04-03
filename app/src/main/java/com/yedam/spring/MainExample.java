package com.yedam.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainExample {
	public static void main(String[] args) {
		ApplicationContext ctx
		= new GenericXmlApplicationContext("classpath:applicationContext.xml"); // 스프링이 실행되면 실행됨
											//or file:src (프로토콜)
											//classpath : (미리 등록된 것 src.main.resources)
											//자신이 참고하는 xml 파일을 정의해줘야 함. (정확하게 대소문자, 확장자까지 명시)
		TV tv =(TV)ctx.getBean("tv");
		
		tv.turnOn(); // nullpointException 이 안뜸.
	}
}
