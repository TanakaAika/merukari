package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Login;

@Controller
public class LoginController {
	@Autowired
	Login login;
	
	@RequestMapping("/loginTransition")
	public String loginTransition() {
		return "login";
	}
	
	@RequestMapping("/login")
	public ModelAndView login(
		@RequestParam(name="mailAddress") String mailAddress,
		@RequestParam(name="password") String password,
		ModelAndView mv
	) {
		login.login(mailAddress, password, mv);
		return mv;
	}

}
