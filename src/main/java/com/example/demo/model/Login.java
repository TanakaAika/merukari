package com.example.demo.model;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@Service
public class Login {
	@Autowired
	HttpSession session;
	@Autowired
	ShowItem showItem;
	@Autowired
	UserRepository userRepository;
	
	public void login(String mailAddress, String password, ModelAndView mv) {
		if((mailAddress.equals(""))||(password.equals(""))) {
			mv.addObject("message","メールアドレスとパスワードを入力してください");
			mv.setViewName("login");
		}
		List<User> userList = userRepository.findByPasswordAndMailAddress(password, mailAddress);
		if(userList.size() == 0) {
			mv.addObject("message","メールアドレスかパスワードが間違っています");
			mv.setViewName("login");
		}else {
			session.setAttribute("loginUser",userList.get(0));
			showItem.getItem(mv);
			mv.setViewName("show_item");
		}
	}

}
