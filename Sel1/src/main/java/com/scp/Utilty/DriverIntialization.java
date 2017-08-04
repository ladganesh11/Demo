package com.scp.Utilty;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.PageFactory;

import com.scp.Ecart.AlreadyLogin;
import com.scp.Ecart.EcartLoginPo;
import com.scp.Ecart.AlreadyLogin;

public class DriverIntialization {
	public static EcartLoginPo BrowserLaunch()
	{
		//WebDriver driver;
		WebDriver driver =new FirefoxDriver();
		driver.get(AppConst.APPLICATION_URL);
		//driver.get(AppConst.Applcation_Url);
		driver.manage().window().maximize();
		//return PageFactory.initElements(driver,EcartLoginPo.class);
		return PageFactory.initElements(driver, EcartLoginPo.class);
		
	}
	public static AlreadyLogin BrowserLaunc(){
		WebDriver driver =new FirefoxDriver();

		driver.get(AppConst.Applcation_Url);
		driver.manage().window().maximize();

		return PageFactory.initElements(driver,AlreadyLogin.class );

	}
	/*
	public static WebDriver  AllBrowser(String WebBrowser,String url){
		WebDriver driver ;
//		@CacheLookup
		if(WebBrowser.equalsIgnoreCase("Firefox"));
		{
			driver =new FirefoxDriver();
		}else if (WebBrowser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
			
		}
		else if(WebBrowser.equalsIgnoreCase("IE"))
		{
			driver =new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}
	*/

}
