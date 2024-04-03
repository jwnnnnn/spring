package com.yedam.java.emp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.java.emp.mapper.EmpMapper;
import com.yedam.java.emp.service.EmpService;
import com.yedam.java.emp.service.EmpVO;

@Service //기능 
public class EmpServiceImpl implements EmpService {
	
	@Autowired // 필드 주입방식 | Di와 관련 | 기본적, 가장편함.
	EmpMapper empMapper; //mapper와 연결하기 위함
	
	
	/*
	  	public EmpServiceImpl(EmpMapper empMapper) {
		this.empMapper = empMapper; 
		// @Autowired 없이 생성자 기반으로 mapper와 연결
		// 가장 안정적
	}
	*/
	
	
	@Override
	public List<EmpVO> empAllList() {
		return empMapper.selectEmpAll(); 
	}

}
