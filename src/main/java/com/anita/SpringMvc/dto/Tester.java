package com.anita.SpringMvc.dto;

public class Tester {
	
private	String firstName;
private	String lastname;
private	String email;
private	String password;
private	String cofmpassword;
private	String contact;
private	String address;
private String gender;
private	String technicalSkills;


Tester(){
	System.out.println("Tester class Constructor");
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
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

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getCofmpassword() {
	return cofmpassword;
}

public void setCofmpassword(String cofmpassword) {
	this.cofmpassword = cofmpassword;
}

public String getContact() {
	return contact;
}

public void setContact(String contact) {
	this.contact = contact;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getGender(String gender) {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}



public String getTechnicalSkills() {
	return technicalSkills;
}

public void setTechnicalSkills(String technicalSkills) {
	this.technicalSkills = technicalSkills;
}

@Override
public String toString() {
	return "Tester [firstName=" + firstName + ", lastname=" + lastname + ", email=" + email + ", password=" + password
			+ ", cofmpassword=" + cofmpassword + ", contact=" + contact + ", address=" + address + ", gender="
			+ gender + ", technicalSkills=" + technicalSkills + "]";
}




	

}
