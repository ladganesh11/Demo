
package com.scp.ExceptionHandling;
//import java com.scp.abstarct;
 
public class Checked {

	public Checked() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			M as = new M ();
			/*String s = new String("ClassNotFound");
			Object o = (Object) s;
			
			*/

			Object o1= new Object();
			String ss = (String)o1;
			try 
			{
			//com.scp.ExceptionHandling.M = new com.scp.ExceptionHandling.M();
				
				{
					String s =null ;
				 System.out.println("length of s"+s.length());	
				}
			}
			
			
				catch(NullPointerException npe)
				{
					System.out.println("this is null ponter exception ");
				}
			finally
			{
				System.out.println("inner finally Executed");
			}
		}
		
		catch (ClassCastException cce) {
			System.out.println("this is class caste exception");
		} 
		//catch (ClassNotFoundException cne) {
			System.out.println("class not found class");
		}
		
		}




