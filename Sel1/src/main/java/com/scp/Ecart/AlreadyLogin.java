package com.scp.Ecart;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AlreadyLogin {
	@CacheLookup
	@FindBy(name="email")
	private WebElement UserNameId ;
	@CacheLookup
	@FindBy(name="passwd")
	private WebElement Password;
	
	public void AlreadyRegister(String uid,String pwd)
	{
		 UserNameId.clear();
		 UserNameId.sendKeys(uid);
		 Password.clear();
		 Password.sendKeys(pwd);
		 
		 
	}
}
