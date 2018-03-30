package org.yunrich.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.yunrich.dao.ClassMateInfoMapper;
import org.yunrich.model.ClassMateInfo;

@Controller
@RequestMapping("first")
public class FirstMvcController {
	
	@Autowired
	private ClassMateInfoMapper classMateInfoMapper;
	@RequestMapping("show")
	public String firstShow(HttpServletRequest request,Model model){
		String stuId = "105501106048";
		
		ClassMateInfo classMateInfo = classMateInfoMapper.selectByPrimaryKey(stuId);
		
		model.addAttribute("info", classMateInfo);
		
		return "show";
	}
}
