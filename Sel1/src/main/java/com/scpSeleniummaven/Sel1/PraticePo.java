package com.scpSeleniummaven.Sel1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PraticePo {

	WebDriver driver ;
	 By EmailAddres = By.name("email_create");
	By CreateLoginButton =By.id("Submit_Create");
	
	
	public void LoginPage(WebDriver driver)
	{
		this.driver =driver;
		
		
	}

	public void login()
	{
	//	driver.findElement(EmailAddres).sendKeys(EmailAddres);
		try 
		{
		driver.findElement(EmailAddres).sendKeys("ladganesh11@gmail.com");
		}
		catch(NullPointerException npe)
		{
			System.out.println("please dont enter blank string ");
		}
		finally
		{
			System.out.println("so finally block running under ");
		}
	}

	public void loginClick()
	{
		driver.findElement(CreateLoginButton).click();

		
	}
}
