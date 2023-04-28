package com.emp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmpController {
	@GetMapping("/")
	public String home() {
		return "index";

	}

	@GetMapping("/add_emp")
	public String remphome() {
		return "add_emp";
	}

}
