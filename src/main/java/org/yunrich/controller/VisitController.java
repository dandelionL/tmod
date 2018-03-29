package org.yunrich.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VisitController {
	
	@RequestMapping("/index")
	public String getIndex(){
		System.out.println("123123123");
		return "index";
	}
}
