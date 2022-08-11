package com.manuel.ecommerce.dao;

import java.util.List;

import com.manuel.ecommerce.beans.CartBean;
import com.manuel.ecommerce.beans.UserBean;

public interface UserDao {
	
	/*private String userName;
	private Long mobileNo;
	private String emailId;
	private String address;
	private int pinCode;
	private String password;
	*/
	
	String registerUser(String userName,Long mobileNo,String emailId,String address,int pinCode,String password);
	
	String registerUser(UserBean user);
	
	boolean isRegistered(String emailId);
		
	String isValidCredential(String emailId, String password);
	
	UserBean getUserDetails(String emailId,String password);
	
	String getFName(String emailId);
	
	String getUserAddr(String userId);
	
	
}
