package com.scp.Ecart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
public class EcartLoginPo {
//	@FindBy(name="firstname")
//	private WebElement firstNameInput;
	
	@SuppressWarnings("unused")
	@CacheLookup
	@FindBy(name="email_create")
	private WebElement EmailInput ;
	
	
	public void Login(String Mail)
	{
		EmailInput.clear();
		EmailInput.sendKeys(Mail);
	}
	
}
