package ToolsqaPrticeForm;
import org.apache.log4j.Logger;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class PraticeForm {
	public Logger log = Logger.getLogger(PraticeForm.class);

@FindBy(name="firstname")
private WebElement FirstNameInput ;
@FindBy(name="lastname")
private WebElement LastNameInput;
@FindBy(name="sex")
private List<WebElement> SexInput;
@FindBy(name="exp")
private List <WebElement> ExpInput;

@FindBy(name="")
private WebElement BrowseUpload ;

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
 public void CountExp (String Typ)
 {
	 System.out.println("select exp of candiadate"+Typ);
	 for (WebElement ex : ExpInput) 
	 {
	if(ex.getAttribute("Type").equals(Typ))
	{
		ex.click();
		break;
	}
	}
 }

 public void BrowseUploadingFile (String path,String DestinationPath)
 {
	 
	 
 }
}

