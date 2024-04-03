package com.yedam.java.emp.mapper;

import java.util.List;

import com.yedam.java.emp.service.EmpVO;

public interface EmpMapper {
	//인터페이스라서 bean으로 등록될 대상이 아님
	
	public List<EmpVO> selectEmpAll();
}
