package com.scpSeleniummaven.Sel1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlreadyRegister {

	WebDriver driver;
	By Email_Id = By.xpath("html/body/div[1]/div[2]/div/div[3]/div/div/div[2]/form/div/div[1]/input");
	By Password = By.xpath("html/body/div[1]/div[2]/div/div[3]/div/div/div[2]/form/div/div[2]/span/");
	By AlredyLogBtn = By.xpath("html/body/div[1]/div[2]/div/div[3]/div/div/div[2]/form/div/p[2]/button");
	
public void DriverLogin()
{
	this.driver= driver;
	
}
public void AlreadyLoginUser(String Email,String Pwd)
{
	//driver.findElement(Email_Id).sendKeys(keysToSend);
	//driver.findElement(Password).sendKeys("ganesh1188");
	
}
public void AlreadyLog()
{
	driver.findElement(AlredyLogBtn).click();
}
}

