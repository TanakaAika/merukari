package com.example.demo.model;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@Service
public class Signup {
	@Autowired
	UserRepository userRepository;
	
	public void signup(String nickname, String name, String password, String mailAddress, String phoneNumber, String birthday) {
		userRepository.save(new User(nickname, name, password, mailAddress, phoneNumber, Date.valueOf(birthday)));
	}

}
