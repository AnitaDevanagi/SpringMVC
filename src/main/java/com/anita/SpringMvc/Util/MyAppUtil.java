package com.anita.SpringMvc.Util;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class MyAppUtil {
	 @Autowired 
	   private JavaMailSender mailsender;
	 
   public int generateOTP() {
	    Random random = new Random();
		String  otp = String.format("%04d" ,random.nextInt(9999));
		System.out.println(otp);
		   
		 return Integer.parseInt(otp);
   }
   
   public void sendmail(String to , int otp) {
	   SimpleMailMessage simpleMailMessage =new SimpleMailMessage();
	   simpleMailMessage.setTo("anitashankar86@gmail.com");
	   simpleMailMessage.setFrom("anitasddevanagi1@gmail.com");
	   simpleMailMessage.setSubject("OTP for myApp reset password");
	   simpleMailMessage.setText("Your otp is :"+otp);
	   mailsender.send(simpleMailMessage);
   }
}
