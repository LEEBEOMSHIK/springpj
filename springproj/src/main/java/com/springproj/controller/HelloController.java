package com.springproj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	public String hello() {
		return "/WEB-INF/views/list.jsp";  //view 리솔브 라이브러리가 있어 페이지로 이동가능하게 해줌
	}

}
