package com.javaex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/gbc") //공통으로 뺌 
public class Test {
	
	//필드
	
	//생성자
	
	//메소드 gs 
	
	//메소드 일반 
	@RequestMapping(value="/list", method={RequestMethod.GET, RequestMethod.POST})
	public String TestPrint() {
		System.out.println("TestPrint");
		
		return "/WEB-INF/views/Test.jsp";
	}
	

}
