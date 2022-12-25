package com.anita.SpringMvc.dao;

import com.anita.SpringMvc.Entity.Myapp_Register;

public interface TestDAO {
  public abstract void save(Myapp_Register register);
  
  public Myapp_Register getByEmailId(String email);
}
