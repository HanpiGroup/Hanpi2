package com.jbit.entity;

import java.io.Serializable;

public class Book implements Serializable {

	private int book_id;
	private String book_name;
	private double book_price;
	private String book_detail;
	private String book_public;
	private int book_status;
	
	private int user_id;
	
	
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	
	public double getBook_price() {
		return book_price;
	}
	public void setBook_price(double book_price) {
		this.book_price = book_price;
	}
	public String getBook_detail() {
		return book_detail;
	}
	public void setBook_detail(String book_detail) {
		this.book_detail = book_detail;
	}
	public String getBook_public() {
		return book_public;
	}
	public void setBook_public(String book_public) {
		this.book_public = book_public;
	}
	public int getBook_status() {
		return book_status;
	}
	public void setBook_status(int book_status) {
		this.book_status = book_status;
	}
	
	public Book(int book_id, String book_name, double book_price, String book_detail, String book_public,
			int book_status) {
		super();
		this.book_id = book_id;
		this.book_name = book_name;
		this.book_price = book_price;
		this.book_detail = book_detail;
		this.book_public = book_public;
		this.book_status = book_status;
	}
	public Book() {
		super();
	}
	
	
}
