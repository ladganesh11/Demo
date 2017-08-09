package com.scp.collection;

import java.util.Stack;

public class Staack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Comparable> sk =new Stack<Comparable>();
		sk.push("ABC");
		sk.push(1254);
		sk.push('a');
		sk.push("rock1222");
		sk.push(125.5f);
		System.out.println("############stack element"+sk);
	    sk.pop();
		System.out.println("############stack element"+sk);
       System.out.println(sk.search(1254));
       System.out.println(sk.peek());
       System.out.println(sk.size());
       sk.add(2, 'a');
       System.out.println();
		System.out.println("############stack element"+sk);

		
		

	}

}
