package sel1;
import com.scp.programs.*;
public class OutSidePackage extends Sample {

	 public void show()
	    {
	    	//System.out.println(privateVar); 
		 /*
		  1. private data members never accessible outside of the package
		  
		  2. default member also not accessible outside of the package
		  */
	    	System.out.println("value of publicvar"+publicVar);
	    	System.out.println(floatVar);
	    	//System.out.println(defaultVar);
		
	    }
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class A extends OutSidePackage 
{
	public void m1()
	{
		
		System.out.println("value of publicvar"+publicVar);
    	System.out.println(floatVar);
    	
	System.out.println("");
	}
}