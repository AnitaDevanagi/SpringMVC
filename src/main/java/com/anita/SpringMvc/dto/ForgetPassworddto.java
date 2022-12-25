package com.anita.SpringMvc.dto;

public class ForgetPassworddto {
	private String email;
    private int otp;
	private String newpassword;
	private String confirmNewpassword;
	
	ForgetPassworddto(){
		System.out.println(" ForgetPassworddto class Constructor");
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getOtp() {
		return otp;
	}
	public void setOtp(int otp) {
		this.otp = otp;
	}
	public String getNewpassword() {
		return newpassword;
	}
	public void setNewpassword(String newpassword) {
		this.newpassword = newpassword;
	}
	public String getConfirmNewpassword() {
		return confirmNewpassword;
	}
	public void setConfirmNewpassword(String confirmNewpassword) {
		this.confirmNewpassword = confirmNewpassword;
	}
	@Override
	public String toString() {
		return "ForgetPassworddto [email=" + email + ", otp=" + otp + ", newpassword=" + newpassword
				+ ", confirmNewpassword=" + confirmNewpassword + "]";
	}
	
	

}
