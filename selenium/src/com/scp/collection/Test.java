/**
 * 
 */
package com.scp.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.Iterator;
import java.util.LinkedList;
//import java.util.
/**
 * @author Ganesh
 *
 */
public class Test {

	// static Object ;

	//private static Object for(Stud ss:v);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address s1 =new Address("ll","fc","pune","india",112121);
		Address s2 =new Address("l2","jm","pune","india",112121);
		Address s3 =new Address("l32","fgc","pune","india",112121);
		Address s4 =new Address("l23","fcghh","pune","india",112121);
		Address s5 =new Address("ll1","deccan","pune","india",112121);

		Stud e1 = new Stud(1,"ABC",89,s1);
		Stud e2 = new Stud(2,"ramesh",83,s2);
		Stud e3 = new Stud(3,"suru",98,s3);
		Stud e4 = new Stud(4,"guru",80,s4);
		Stud e5 = new Stud(5,"jd",83,s5);
		
		/*Address ad1 = new Address("l1","fc","Pune","India",414121);
		Address ad2 = new Address("l2","JM","Pune","India",414121);
		Address ad3 = new Address("l3","KARVE","Pune","India",414121);
		Address ad4 = new Address("l4","STATION","Pune","India",414121);
		Address ad5 = new Address("l5","SATARA","Pune","India",414121);
		Address ad6 = new Address("l6","Z--BRIDGE","Pune","India",414121);
		*/
		List <Stud> sl = new ArrayList();
		sl.add(e1);
		sl.add(e2);
		sl.add(e3);
		sl.add(e4);
		sl.add(e5);

		System.out.println(sl);
		
	System.out.println("sl before updating");
		for(int i=0;i<sl.size();i++)
		{
			System.out.println(sl.get(i));
			//System.out.println(sl.toString());
		}
System.out.println("###########################Object are print by using Linklist##############################################");
		LinkedList<Stud> ll = new LinkedList<Stud>();
		ll.add(e1);
		ll.add(e2);	
		ll.add(e3);		
		ll.add(e4);		
		ll.add(e5);		
		System.out.println(ll);
		for (Stud stud : ll) {
			System.out.println("ll elements ######"+stud);
			
		}
	System.out.println("elements print by Vector class");
		Vector<Stud> v=new Vector<Stud> ();
		v.add(e1);
		v.add(e2);
		v.add(e3);
		v.add(e4);
		v.add(e5);
		System.out.println(v);
		for(Stud ss:v){
			System.out.println("ll elements "+ss);
		}


	}

}
