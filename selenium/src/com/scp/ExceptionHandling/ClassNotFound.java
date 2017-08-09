package com.scp.ExceptionHandling;

public class ClassNotFound {

	public ClassNotFound() {
		// TODO Auto-generated constructor stub
	}
	static ArithmeticException ae = new ArithmeticException();
	

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		//throw ae;
		
		/*try 
		 * 
		{
			class.ForName = new ForName ("abc");
		}
		catch (ClassNotFoundException cnfe)
		{
			System.out.println("Such class is not avilable in project ");
			
		}*/
		//throw new ArithmeticException("divide by zero");

		try {
			try 
			{
				System.out.println(10 / 0);

				System.out.println("yes inside of catch try is alooweded");
			}
			catch (ArithmeticException a)
			{
				System.out.println("inside catch block");
			}
			finally 
			{
				System.out.println("ineer finall under of catch block");
			}

			System.out.println(10 / 0);
			
		} catch (ArithmeticException ae) {
			try 
			{
				System.out.println(10 / 0);

				System.out.println("yes inside of catch try is alooweded");
			}
			catch (ArithmeticException a)
			{
				System.out.println("inside catch block");
			}
			finally 
			{
				System.out.println("ineer finall under of catch block");
			}
			System.out.println("hi ");
		} finally {
			try 
			{
				System.out.println(10 / 0);

				System.out.println("yes inside of catch try is alooweded");
			}
			catch (ArithmeticException a)
			{
				System.out.println("inside catch block");
			}
			finally 
			{
				try 
				{
					System.out.println(10 / 0);

					System.out.println("yes inside of catch try is alooweded");
				}
				finally 
				{
					System.out.println("finally under only try and catch");
				}

				System.out.println("ineer finall under of catch block");
			}

			System.out.println("end of try catch");

		}
	}

}
