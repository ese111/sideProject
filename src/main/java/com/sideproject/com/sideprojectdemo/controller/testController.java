package com.sideproject.com.sideprojectdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
/*
 * @author : 최별규
 * @version : 1.0
 * Date           Developer     Content
 * -----------   ----------     -------- 
 * 2021/08/04       최별규        mvctest
 * */
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class testController {
	
	@GetMapping("/test")
	public String testPage() {
		return "test";
	}
	
	@GetMapping("/apiTest")
	public String apiTest(@RequestParam(value ="name", required = false)String name, Model model) {
		model.addAttribute("name", name);
		return "apiReturn";
	}
	
}
