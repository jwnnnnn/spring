package com.yedam.spring.annotation;

import org.springframework.stereotype.Component;

@Component //클래스 속성만 사용하는 것과 같음
public class Chef {
	
	
	public void cooking() {
		System.out.println("xml 방식");
	}
}
