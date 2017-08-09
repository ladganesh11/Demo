package com.scp.polymorphism;

public class Overload {

	public Overload() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a = new A();
		a.m1();
	  	a.m1(1255);
		BB b = new BB();
		b.m1();
		b.m1(15245);
		b.m1(12555.233, 125.235f);
		A ab = new BB();
		ab.m1();
		ab.m1(125);
	}

}

class A {
	public void m1() {
		System.out.println("class A method  m1() ");
	}

	public int m1(int i) {
		System.out.println("this is method overloading");
		return 0;
	}
}

class BB extends A {
	public int m1(double d, float f) {
		System.out.println("m1 method overload from class A");
		return 0;
	}

	public void m1() {
		System.out.println("this is method overrride M1()");
	}
}