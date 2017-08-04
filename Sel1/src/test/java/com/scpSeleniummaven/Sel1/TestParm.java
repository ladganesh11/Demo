package com.scpSeleniummaven.Sel1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestParm {
     @Test
	public void login ()
	{
		WebDriver  driver = new FirefoxDriver ();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		PraticePo pp =new PraticePo();
		pp.login();
		pp.loginClick();
		
		AlreadyRegister al =new AlreadyRegister();
		//al.AlreadyLoginUser();
		driver.quit();
	}
}
