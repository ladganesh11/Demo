package com.scp.toolsqaRegistrationForm;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registration {

	public Registration() {
			// TODO Auto-generated constructor stub
	}

	@FindBy(id ="name_3_lastname")
	private WebElement LastNameInput;
	
	@FindBy(id ="name_3_firstname")
	private WebElement FirstNameInput;

	
	
	public void FillUsernamepwd(String Fname,String Lname)
	{
		FirstNameInput.clear();
		FirstNameInput.sendKeys(Fname);
		
		LastNameInput.sendKeys(Lname);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
