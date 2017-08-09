package com.scp.programs;

public class Sample {

    private  int privateVar=1000 ;
    public String publicVar="Ganesh";
    protected float floatVar=5226.2f;
    String defaultVar;
    public void show()
    {
    	System.out.println(privateVar);
    	System.out.println(publicVar);
    	System.out.println(floatVar);
    	System.out.println(defaultVar);
	
    }
    
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println(" currently in class Sample class");


	}

}
class A 
{
	public static void main(String [] args)
	{


	System.out.println(" currently in class a");
    }
}
class AB
{
	public static void main(String [] args)
	{


	System.out.println(" currently in class a");
    }
}