package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//@Controller
public class Controller2 {
	@RequestMapping("/")
	public String indexPage() {
		System.out.println("helo");
		return "redirect:/index";
	}
}
