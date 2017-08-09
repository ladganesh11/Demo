/**
 * 
 */
package com.scp.collection;
import java.util.LinkedList;
/**
 * @author Ganesh
 *
 */
public class LinkListDemo {

	private static Object foreach;

	/**
	 * 
	 */
	public LinkListDemo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param <foreach>
	 * @param args
	 */
	public static <foreach> void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings({ "rawtypes", "unused" })
		LinkedList<String> lk = new LinkedList<String>();
		lk.add("A");
		lk.add("B");
		try {
			lk.add(11, null);
		} catch (IndexOutOfBoundsException oe) {
			System.out.println("indexoutofboundsexception");
		} finally {
			System.out.println("handled all exception from programme");
		}
		
		lk.add(null);
		try
		{
			lk.remove(args[2]);
		}
		catch(ArrayIndexOutOfBoundsException aioe)
		{
		System.out.println("hadle the arrayindexout of boundsexample");
		}
		lk.removeAll(lk);
		lk.add("java developement");
		lk.add( null);
		System.out.println("GetFirst method"+lk.getFirst());
		
		System.out.println("print the LnkList data" + lk);
		lk.remove(1);
		lk.size();
		System.out.println("Last indexof elemnet" + lk.indexOf(5));
		System.out.println(	lk.descendingIterator().toString().codePointAt(2));
		System.out.println(lk);

		System.out.println("instance block ");	
		}
	}


