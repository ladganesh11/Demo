package sel1;

public class Add {

	
	public void m1(int mm ,int mn)
	{
	 
		System.out.println("this m1 is from class Add");
		
		System.out.println("add of two by using this keyword"+(mm+mn));
		}
	public int substract(int a,int b)
	{
		System.out.println("add of two by using this keyword\'"+(a-b));
       return 0;
    	}
	public class Sad extends Add
	{
		public void m1()
		{
			System.out.println("this is m1 from Sad class");
			m1();
			int String=10;
			System.out.println(String);
			int Runnable =256;
			System.out.println(Runnable);
			}
		}
	
	public  static void m2(String ss,String cc)
	{
		System.out.println("print string providing in a method m2\""+ss);
		}
	 	public static void main(String[] args)
	 	{
		// TODO Auto-generated method stub
	 		Add aa = new Add();
	 		aa.m1(100, 200);
	 		aa.substract(12251, 154216);
	 	    Add.m2("wrong method","correct method");	
	 	    //Sad dd = new Sad();
	 	    
	 	    
            
	 	
	 	    int num11=122;
	 	int num2=2334;
	 	int sum=num11+num2;
	 		 System.out.println("sum off two numbers are:---"+sum);
	 	int substract=num11-num2;
	 	System.out.println("substraction of two numbers"+substract);
	 	int multifcation = num11*num2;
	 	System.out.println("multification of two numbers"+multifcation);
	 	int division = num11*num2;
	 	System.out.println("division of two numbers"+division);
	 	int mod = num11%num2;
	 	System.out.println("mod of two numbers"+mod);
	 	}
	 	}
