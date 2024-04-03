package com.yedam.java.emp.service;

import java.util.Date;

import lombok.Data;

@Data
public class EmpVO {	//@Data 롬복부터 쓰고 시작
	// 데이터베이스에서 받고 전달할 데이터
	private Integer employeeId; 
	private String lastName;
	private String email;
	private Date hireDate;
	private String jobId;
}
