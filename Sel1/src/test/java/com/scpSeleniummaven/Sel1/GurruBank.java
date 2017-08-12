package com.scpSeleniummaven.Sel1;

import org.testng.annotations.Test;

//import com.scp.Ecart.EcartLoginPo;
import com.scp.Utilty.DriverIntialization;

import DemoGurruBankingDomain.RegisterBankPo;

public class GurruBank {

	public GurruBank() {
		// TODO Auto-generated constructor stub
	}
	@Test
	public void  GuruBank ()
	{
		//EcartLoginPo ecp = DriverIntialization.BrowserLaunch();
		RegisterBankPo rbg = DriverIntialization.launch();
		rbg.submitCredintial("Add New Customer","Ganesh Lad", "male", "12/12/2012", "pune", "pune", "maharashatra", "411011", "9874561230", "ladganesh11@gmail.com", "123456789");
		
	}

}
