package com.scpSeleniummaven.Sel1;

import org.testng.annotations.Test;

import com.scp.Ecart.AlreadyLogin;
//import com.scp.Ecart.EcartLoginPo;
import com.scp.Utilty.DriverIntialization;

public class EcartTest {
	@Test
	public void CreateAccount() throws Exception
	{
		//EcartLoginPo ecp = DriverIntialization.BrowserLaunch();
		//ecp.Login("ladganesh11@gmail.com");
		AlreadyLogin al =  DriverIntialization.BrowserLaunc();
		al.AlreadyRegister("ladganesh11@gmail.com", "ganesh1188");
	}

}
