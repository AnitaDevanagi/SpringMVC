package com.anita.SpringMvc.ServiceLayer;


import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anita.SpringMvc.Entity.Myapp_Register;
import com.anita.SpringMvc.Util.MyAppUtil;
import com.anita.SpringMvc.dao.TestDAO;
import com.anita.SpringMvc.dto.ForgetPassworddto;
import com.anita.SpringMvc.dto.Logindto;
import com.anita.SpringMvc.dto.Tester;



@Service
public class CommonServiceImpl implements CommonService{
    @Autowired
	private TestDAO dao;
    @Autowired
    private MyAppUtil util;
	public String validateandSave(Tester test) {
		if(test.getEmail() != null && !test.getEmail().isEmpty()) {
			if(test.getPassword()!=null &&!test.getPassword().isEmpty()) {
				if(test.getCofmpassword()!=null &&!test.getCofmpassword().isEmpty()&& test.getCofmpassword().equals(test.getPassword())) {
					Myapp_Register register =new Myapp_Register();
					register.setPassword(test.getPassword());
					register.setEmail(test.getEmail());
					register.setContact(test.getContact());
					dao.save(register);
				}else {
					return "Invalid Confirm password";
				}
				
			}else {
				return "Invald password";
			}
			
		}else {
			return "Invalid email-id";
		}
			
		return "data Saved";
	}
	public String validateandLogin(Logindto dto) {
		if(dto.getEmail()!=null && !dto.getEmail().isEmpty()) {
			if(dto.getPassword()!=null && !dto.getPassword().isEmpty()) {
				 Myapp_Register  myapp_Register =dao.getByEmailId(dto.getEmail());
				 if(dto.getEmail().equals(myapp_Register.getEmail())&& dto.getPassword().equals(myapp_Register.getPassword())) {
					 return  dto.getEmail();
					 
				 }else {
					 return "Invalid Email and Password";
				 }
			}else {
				return "Invalid Password";
			}
			
		}else {
			return "Invalid Email-id";
		}
		
		
	}
	public Myapp_Register getMyProfile(String email) {
		 Myapp_Register  myapp_Register =null;
		if(email!=null && !email.isEmpty()) {
	        myapp_Register =dao.getByEmailId(email);
		}
			
		
		return myapp_Register;
	}
	public String validateandsentOTP(String email) {
		if(email!=null && !email.isEmpty()) {
			Myapp_Register myapp_Register =dao.getByEmailId(email);
		 if(myapp_Register!=null) {
			 //send otp
		int otp=util.generateOTP();
		util.sendmail(email, otp);
		myapp_Register.setOtp(otp);
		dao.save(myapp_Register);
			 return"Sent OTP";
		 }else {
			 return "email not register";
		 }
		}else {
			return "Invalid Email-Id";
		}
		
	}
	public String validateandupdatepassword(ForgetPassworddto dto) {
		if(dto.getEmail()!=null && !dto.getEmail().isEmpty()) {
			Myapp_Register myapp_Register =dao.getByEmailId(dto.getEmail());
			if(dto.getOtp()== myapp_Register.getOtp()) {
				if(dto.getNewpassword()!=null &&!dto.getNewpassword().isEmpty()) {
					if(dto.getConfirmNewpassword()!=null &&!dto.getConfirmNewpassword().isEmpty()&& dto.getConfirmNewpassword().equals(dto.getNewpassword())) {
						myapp_Register.setPassword(dto.getNewpassword());
						myapp_Register.setOtp(0);
						dao.save(myapp_Register);
						return "password updated";
						
					}else {
						return "Invalid Confirm password";
					}
					
				}else {
					return "Invalid password";
				}	
				
			}else {
				return "Invalid otp";
			}
			
		}else {
			return "Invalid email";
		}
		
	}

}
