package com.mav;

import java.util.ResourceBundle;

public class sourcecodey {
	
	public int userLogin(String username, String password)
	{
	ResourceBundle bund = ResourceBundle.getBundle("config");
	String userName = bund.getString("username");
	String passwordy = bund.getString("password");
	
	if(username.equals(userName)&&password.equals(passwordy))
		return 1;
	else
		return 0;	
	}

}
