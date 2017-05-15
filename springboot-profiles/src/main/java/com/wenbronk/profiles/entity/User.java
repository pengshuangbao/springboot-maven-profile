package com.wenbronk.profiles.entity;

import java.io.Serializable;

//@Entity
//@Table(name="user")
public class User implements Serializable{
	private static final long serialVersionUID = -4672212108745361785L;

	private String user_name;
	private String pass_word;
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getPass_word() {
		return pass_word;
	}
	public void setPass_word(String pass_word) {
		this.pass_word = pass_word;
	}
	@Override
	public String toString() {
		return "User [user_name=" + user_name + ", pass_word=" + pass_word + "]";
	}
}
