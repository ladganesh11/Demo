package com.scpSeleniummaven.Sel1;

import org.testng.annotations.Test;

import com.scp.Utilty.DriverIntialization;

import ToolsqaPrticeForm.PraticeForm;

public class ToolsqaForm {
	@Test
	public void Prtice () throws Exception
	{
		PraticeForm pp = DriverIntialization.Launch();
		pp.FillForm("ganesh", "lad");
		pp.SelectGender("male");
	}
	

}
