package com.aciworldwide.aciwebapplication.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/Home")
	public String index() {
		return "Home.jsp";
	}
}
