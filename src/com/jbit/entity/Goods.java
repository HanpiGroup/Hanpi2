package com.jbit.entity;

import java.io.Serializable;

public class Goods implements Serializable {

	private int goods_id;
	private String goods_name;
	private double goods_price;
	private int goods_num;
	private String goods_detail;
	private String goods_type;
	private String goods_code;
	
	public int getGoods_id() {
		return goods_id;
	}
	public void setGoods_id(int goods_id) {
		this.goods_id = goods_id;
	}
	public String getGoods_name() {
		return goods_name;
	}
	public void setGoods_name(String goods_name) {
		this.goods_name = goods_name;
	}
	public double getGoods_price() {
		return goods_price;
	}
	public void setGoods_price(double goods_price) {
		this.goods_price = goods_price;
	}
	public int getGoods_num() {
		return goods_num;
	}
	public void setGoods_num(int goods_num) {
		this.goods_num = goods_num;
	}
	public String getGoods_detail() {
		return goods_detail;
	}
	public void setGoods_detail(String goods_detail) {
		this.goods_detail = goods_detail;
	}
	public String getGoods_type() {
		return goods_type;
	}
	public void setGoods_type(String goods_type) {
		this.goods_type = goods_type;
	}
	public String getGoods_code() {
		return goods_code;
	}
	public void setGoods_code(String goods_code) {
		this.goods_code = goods_code;
	}
	public Goods(int goods_id, String goods_name, double goods_price, int goods_num, String goods_detail,
			String goods_type, String goods_code) {
		super();
		this.goods_id = goods_id;
		this.goods_name = goods_name;
		this.goods_price = goods_price;
		this.goods_num = goods_num;
		this.goods_detail = goods_detail;
		this.goods_type = goods_type;
		this.goods_code = goods_code;
	}
	public Goods() {
		super();
	}
	
	
}
