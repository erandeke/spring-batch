package com.springbatch.batchJob.model;

import javax.persistence.Entity;

@Entity
public class User {

	
	
	@javax.persistence.Id
	private int user_indentity;
	private String user_code;
	private String user_department;
	private double user_pay_scale;

	
	
	
	
	
	
	
	
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getUser_indentity() {
		return user_indentity;
	}

	public void setUser_indentity(int user_indentity) {
		this.user_indentity = user_indentity;
	}

	public String getUser_code() {
		return user_code;
	}

	public void setUser_code(String user_code) {
		this.user_code = user_code;
	}

	public String getUser_department() {
		return user_department;
	}

	public void setUser_department(String user_department) {
		this.user_department = user_department;
	}

	public double getUser_pay_scale() {
		return user_pay_scale;
	}

	public void setUser_pay_scale(double user_pay_scale) {
		this.user_pay_scale = user_pay_scale;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "id:"+user_indentity+"name:"+user_code+"dept:"+user_department+"salary:"+user_pay_scale;
	}
}
