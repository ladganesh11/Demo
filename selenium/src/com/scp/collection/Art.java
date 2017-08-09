package com.scp.collection;
import java.util.ArrayList;;
public class Art {

	/*
	 * Arraylist Method 
	 * add()
	 * remove()
	 * size()
	 * lastindexin arraylist
	 * add particular array index location add
	 * */
	public Art() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("rawtypes")
		ArrayList<Comparable>  a = new ArrayList<Comparable>();
		a.add("ganesh lad");
		a.add(1222);
		a.remove(a);
		a.add("java developement ");
		a.add(12552.25f);

		System.out.println("print allarraylist in one array "+a.toArray().toString());
		try {
			
		
		a.add(11,12);
		}
		catch (IndexOutOfBoundsException ioe)
		{
			System.out.println("plese enter valid range of element in arraylist");
		}
		finally 
		{
			System.out.println("first index out of bound");
		}
		a.add("java ");

		a.add("java support ");

		a.add("java product support");

		a.add("java j2ee");

		a.add("java developement ");

		a.add("java developement ");
        a.remove(args);
        System.out.println(+a.size());
        System.out.println(+a.lastIndexOf(args));
        System.out.println("remove  element from arraylist"+a.remove(2));
		a.add(2,"ganesh lad");
		System.out.println("after remove index [2] element "+a +"again add new string ganesh lad in index [2]"+a);
		
		try {
		a.add(1255555, 788);
		}
		catch (IndexOutOfBoundsException ioe)
		{
			ioe.printStackTrace();
			System.out.println(ioe.getMessage());
			System.out.println(ioe.fillInStackTrace());
			System.out.println("plese enter valid range of element in arraylist");
		}
		finally
		{
			System.out.println("finally blocked .to clean up all resouresc data object");
		}
		System.out.println("print element"+a);

	}

}
