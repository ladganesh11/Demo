package DemoGurruBankingDomain;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterBankPo {

	public RegisterBankPo() {
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="html/body/table/tbody/tr/td/table/tbody/tr[1]/td/p")
private 	WebElement AddNewCustomer  ;
	
	@FindBy(name="name")
	private WebElement UsernameInput;
	
	@FindBy(name="rad1")
	private List<WebElement> GenderInput;
	
	@FindBy(id="dob")
	private WebElement DobInput;
	
	@FindBy(name="addr")
	private WebElement AddressInput;
	
	@FindBy(name="city")
	private WebElement CityInput;
	
	@FindBy(name="state")
	private WebElement StateInput;
	
	@FindBy(name="pinno")
	private WebElement PinInput;
	
	@FindBy(name="telephoneno")
	private WebElement TelephoneInput;
	
	@FindBy(name="emailid")
	private WebElement EmailidInput;
	
	@FindBy(name="password")
	private WebElement PasswordInput;
	
	@FindBy(name="sub")
	private WebElement Submitbtn;

	//private Object for(gender:GenderInput);
	
	public void submitCredintial ( String labname,String name ,String type,String str ,String address,String city,String state,String  pin ,String telephone,String emailid,String Password)
	{
		AddNewCustomer.click();
		
		UsernameInput.clear();
		UsernameInput.sendKeys(name);
		
		System.out.println("select the type of gender is "+type );
		 for(WebElement gender:GenderInput){
			 
			 if (gender.getAttribute("value").equals(type))
			 {
				 gender.click();
			 }
			 
		 }
		 
		 System.out.println("dob of employee");
		 DobInput.clear();
		 DobInput.sendKeys(str);
		 
		 System.out.println("select address");
		 AddressInput.clear();
		 AddressInput.sendKeys(address);
		 
		 CityInput.clear();
		 CityInput.sendKeys(city);
		 
		 StateInput.clear();
		 StateInput.sendKeys(state);
		 
		 PinInput.clear();
		 PinInput.sendKeys(pin);
		 
		 TelephoneInput.clear();
		 TelephoneInput.sendKeys(telephone);
		 
		 EmailidInput.clear();
		 EmailidInput.sendKeys(emailid);
		 
		 PasswordInput.clear();
		 PasswordInput.sendKeys(Password);
	SubmitBtn();	 
		
	}
	public void SubmitBtn ()
	{
		Submitbtn.click();
	}
	
	
	
	
	
	
}


