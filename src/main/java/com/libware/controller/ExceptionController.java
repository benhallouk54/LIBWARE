package com.libware.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ExceptionController {

	@RequestMapping("/403")
	public String notFoundErrorHandler(HttpServletRequest request, Exception e) {
		return "403";
	}

	@RequestMapping("/error")
	public String defaultErrorHandler(HttpServletRequest request, Exception e) {
		return "error";
	}
}
