package com.scpSeleniummaven.Sel1;

import org.testng.annotations.Test;

import com.scp.toolsqaRegistrationForm.Registration;

public class RegistTest {

	public RegistTest() {
		
		
		// TODO Auto-generated constructor stub
	}
	@Test
	public void TestReg() throws Exception
	{
		Registration rr = new Registration();
		rr.FillUsernamepwd("ganesh", "lad");
	}

}
