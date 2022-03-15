package com.example.demo.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="item")
public class Item {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="price")
	private int price;
	
	@Column(name="image")
	private String image;
	
	@Column(name="introduction")
	private String introduction;
	
	@Column(name="category_id")
	private String categoryId;
	
	@Column(name="listing_date")
	private Date listingDate;
	
	@Column(name="listing_user_id")
	private int listingUserId;
	
	@Column(name="access")
	private int access;
	
	@Column(name="purchase_user_id")
	private int purchaseUserId;
	
	@Column(name="purchase_date")
	private Date purchaseDate;
	
	@Column(name="payment_method")
	private int paymentMethod;
	
	@Column(name="address")
	private int address;
	
	@Column(name="payment_deadline")
	private Date paymentDeadline;
	
	@Column(name="payment_completion_date")
	private Date paymentCompletionDate;
	
	@Column(name="sendDeadline")
	private Date sendDeadline;
	
	@Column(name="send_completion_date")
	private Date sendCompletionDate;
	
	public Item() {
		
	}
	
	public Item(String name, int price, String introduction, String categoryId,
			Date listingDate, int listingUserId) {
		this.name = name;
		this.price = price;
		this.introduction = introduction;
		this.categoryId = categoryId;
		this.listingDate = listingDate;
		this.listingUserId = listingUserId;
	}
	
	public Item(int id, String name, int price, String image, String introduction,
			String categoryId, Date listingDate, int listingUserId, int access,
			int purchaseUserId, Date purchaseDate, int paymentMethod, int address,
			Date paymentDeadline, Date paymentCompletionDate, Date sendDeadline, Date sendCompletionDate) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.image = image;
		this.introduction = introduction;
		this.categoryId = categoryId;
		this.listingDate = listingDate;
		this.listingUserId = listingUserId;
		this.access = access;
		this.purchaseUserId = purchaseUserId;
		this.purchaseDate = purchaseDate;
		this.paymentMethod = paymentMethod;
		this.address = address;
		this.paymentDeadline = paymentDeadline;
		this.paymentCompletionDate = paymentCompletionDate;
		this.sendDeadline = sendDeadline;
		this.sendCompletionDate = sendCompletionDate;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public String getImage() {
		return image;
	}
	
	public String getIntroduction() {
		return introduction;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public Date getListingDate() {
		return listingDate;
	}

	public int getListingUserId() {
		return listingUserId;
	}

	public int getAccess() {
		return access;
	}

	public Date getPaymentDeadline() {
		return paymentDeadline;
	}

	public Date getPaymentCompletionDate() {
		return paymentCompletionDate;
	}

	public Date getSendDeadline() {
		return sendDeadline;
	}

	public Date getSendCompletionDate() {
		return sendCompletionDate;
	}

	public int getPurchaseUserId() {
		return purchaseUserId;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public int getPaymentMethod() {
		return paymentMethod;
	}

	public int getAddress() {
		return address;
	}

	
	
	
}

