package com.montu.sbms.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class RestControllerDemo {

	@GetMapping("/empData")
	public String getEmpDetails() {
		return "This is Employee Details";
	}
}
