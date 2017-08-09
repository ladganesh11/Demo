package com.scp.ExceptionHandling;

public class Rtrn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	static int m1()
	{
		try{
		System.out.println("try bock");
		return 10;
	}
	catch (ArithmeticException ae)
	{
		System.out.println("in catch block");
		return 30;
	}

}
}
