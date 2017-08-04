package com.scpSeleniummaven.Sel1;

//import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LoginPo {
	@Test
	public void test(){
		 
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		
	}
	

}
