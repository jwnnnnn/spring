package com.yedam.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.yedam.app.**.mapper") 
			//mybatis mapper에 대한 것을 어노케이션으로 대체
			// basePackages = "mapper가 있는 경로의 패키지 경로풀네임"
			// defalut => SpringApplication.run 가 있는 경로

public class Boot240403Application {
			//Boot240403Application => 진입

	public static void main(String[] args) {
		SpringApplication.run(Boot240403Application.class, args);
		
	}

}
