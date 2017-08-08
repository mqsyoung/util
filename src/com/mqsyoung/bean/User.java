package com.mqsyoung.bean;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import com.sun.istack.internal.Nullable;

public class User {

	
	 
	@NotEmpty
	private String lastname;
	

	@Email
	@NotEmpty
	private String email ;


	@DateTimeFormat(pattern="yyyy-MM-dd")
	@NotEmpty
	private Date date;
	
	public User() {
		super();
	}

 

	public User(String lastname, String email, Date date) {
		super();
		this.lastname = lastname;
		this.email = email;
		this.date = date;
	}



	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDate() {
		return date;
	}



	public void setDate(Date date) {
		this.date = date;
	}



	@Override
	public String toString() {
		return "User [lastname=" + lastname + ", email=" + email + ", date="
				+ date + "]";
	}


 

	
}
