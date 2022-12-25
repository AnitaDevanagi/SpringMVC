package com.anita.SpringMvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.anita.SpringMvc.Entity.Myapp_Register;
import com.anita.SpringMvc.ServiceLayer.CommonService;
import com.anita.SpringMvc.dao.TestDAO;
import com.anita.SpringMvc.dto.ForgetPassworddto;
import com.anita.SpringMvc.dto.Logindto;
import com.anita.SpringMvc.dto.Tester;

@Controller
@RequestMapping("/")
public class Test {
	   @Autowired
	  private CommonService service;
	@RequestMapping(value="/register" ,method=RequestMethod.POST)
	public ModelAndView register(Tester test) {
		ModelAndView modelAndView =new ModelAndView();
		String msg = service.validateandSave(test);
		System.out.println(msg);
		modelAndView.addObject("responsemsg", msg);
		modelAndView.setViewName("Home.jsp");
	    return modelAndView;
	 
	}
	@RequestMapping(value="/login" , method=RequestMethod.POST)
	public ModelAndView login(Logindto dto) {
		
		ModelAndView modelAndView =new ModelAndView();
		System.out.println(dto);
		String response  =service.validateandLogin(dto);
		System.out.println(response);
		modelAndView.addObject("responsemsg", response);
		if(response.contains(".com")) {
			modelAndView.setViewName("Home.jsp");
		}else {
			modelAndView.setViewName("LogIn.jsp");
		}
		
		return modelAndView;
		
	}
	
	@RequestMapping(value="/getprofile/{id}", method=RequestMethod.GET)
	 public ModelAndView getMyProfile(@PathVariable("id") String id ) {
		  ModelAndView modelAndView = new ModelAndView();
		  System.out.println(id);
		  Myapp_Register response = service.getMyProfile(id);
		  modelAndView.addObject("details" ,response);
		  System.out.println(response);
		  modelAndView.setViewName("/Home.jsp");
		  return modelAndView;
	 }
	
	@RequestMapping(value="/OTP", method=RequestMethod.POST)
	 public ModelAndView sendOTP(String email) {
		ModelAndView  modelAndView = new ModelAndView ();
		 System.out.println(email);
		String response=service.validateandsentOTP(email);
		modelAndView.addObject("responsemsg", response);
		modelAndView.setViewName("/ForgetPassword.jsp");
		return modelAndView;
		
	}
	@RequestMapping(value="/forgetPassword" , method=RequestMethod.POST)
	public ModelAndView forgetpassword(ForgetPassworddto  dto) {
		ModelAndView modelAndView = new ModelAndView();
        System.out.println(dto);
       String response =service.validateandupdatepassword(dto);
       modelAndView.addObject("responsemsg", response);
       if("password updated".equals(response)) {
    	   modelAndView.setViewName("/LogIn.jsp");
       }else {
    	   modelAndView.setViewName("/ForgetPassword.jsp");
       }
		return modelAndView;
		
	}
 
}
