package com.yedam.java.emp.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yedam.java.emp.service.EmpService;
import com.yedam.java.emp.service.EmpVO;

@Controller //bean으로 등록되는 컨트롤러 | 
public class EmpController {
	
	@Autowired //service를 Autowried
	EmpService empService;
	
	// 서비스가 가지는 메소드 하나하나가 라우팅.	
				//path 경로						//method 를 이용해서 결과를 담고
	@RequestMapping(path ="empList", method = RequestMethod.GET)
	public String empList(Model model) {
		List<EmpVO> list = empService.empAllList();
		model.addAttribute("empList", list); //empList에 list를 담고 list는 서비스가 반환시켜줌
						//"empList" => jsp 파일에 파일을 넘겨줄 때 쓰임.
		return "empList"; // 이 empList.jsp라고 하는 곳에 뿌려줌
	}
}
