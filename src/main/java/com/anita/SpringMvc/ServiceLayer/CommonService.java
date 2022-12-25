package com.anita.SpringMvc.ServiceLayer;

import com.anita.SpringMvc.Entity.Myapp_Register;
import com.anita.SpringMvc.dto.ForgetPassworddto;
import com.anita.SpringMvc.dto.Logindto;
import com.anita.SpringMvc.dto.Tester;

public interface CommonService {
	public String validateandSave(Tester test);
	
	public String validateandLogin(Logindto dto);
	
	
	public Myapp_Register getMyProfile(String email);
	
	public String validateandsentOTP(String email);

	public String validateandupdatepassword(ForgetPassworddto dto);
}
