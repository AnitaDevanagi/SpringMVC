package com.anita.SpringMvc.dto;

public class Logindto {
	private String email;
	private String password;
	
	Logindto(){
		System.out.println("Logindto");
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Logindto [email=" + email + ", password=" + password + "]";
	}

	
}
