package ToolsqaPrticeForm;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PraticeForm {
@FindBy(name="firstname")
private WebElement FirstNameInput ;
@FindBy(name="lastname")
private WebElement LastNameInput;
@FindBy(name="sex")
private List<WebElement> SexInput;
public void FillForm (String Fname,String Lname)
{
	FirstNameInput.clear();
	FirstNameInput.sendKeys(Fname);
	LastNameInput.clear();
	LastNameInput.sendKeys(Lname);
	
	
}
 public void SelectGender(String Type)
 {
	 System.out.println("select gender from "+Type);
	for(WebElement gender:SexInput)
	{
		if(gender.getAttribute("value").equals(Type))
		{
			gender.click();
			break;
		}
	}
	 
 }

}

