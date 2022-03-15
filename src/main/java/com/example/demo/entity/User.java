package com.example.demo.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="nickname")
	private String nickname;

	@Column(name="name")
	private String name;
	
	@Column(name="password")
	private String password;
	
	@Column(name="mail_address")
	private String mailAddress;
	
	@Column(name="phone_number")
	private String phoneNumber;
	
	@Column(name="birthday")
	private Date birthday;
	
	@Column(name="purchase_times")
	private int purchaseTimes;
	
	@Column(name="sales_times")
	private int salesTimes;
	
	@Column(name="level")
	private int level;
	
	@Column(name="image")
	private String image;
	
	public User() {}
	
	public User(String nickname, String name, String password, 
		String mailAddress, String phoneNumber, Date birthday
	) {
		this.nickname = nickname;
		this.name = name;
		this.password = password;
		this.mailAddress = mailAddress;
		this.phoneNumber = phoneNumber;
		this.birthday = birthday;
	}

	public int getId() {
		return id;
	}

	public String getNickname() {
		return nickname;
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	public String getMailAddress() {
		return mailAddress;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public Date getBirthday() {
		return birthday;
	}

	public int getPurchaseTimes() {
		return purchaseTimes;
	}

	public int getSalesTimes() {
		return salesTimes;
	}

	public int getLevel() {
		return level;
	}

	public String getImage() {
		return image;
	}
	
	
}
