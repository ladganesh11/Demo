package com.scp.ExceptionHandling;

import com.scp.ExceptionHandling.D.F;

public class ExcpOverride {

	public static void main(String[] args) throws InterruptedException, ClassNotFoundException {
		// TODO Auto-generated method stub

		AA obj = new AA();
		obj.m1();
		BB b = new BB();
		b.m1();
		C vc = new C();
		vc.m1();
		D dd = new D();
		dd.m1();
		F ff = new F();
		F.m2();
	}

}

class AA {
	void m1() throws InterruptedException {
		System.out.println("throws keyword");
	}
}

class BB extends AA {
	void m1() throws InterruptedException {
		System.out.println("throws keyword B");

	}
}

class C extends AA {
	void m1() throws InterruptedException {
		System.out.println("throws keyword C");

	}

}

class D extends AA {
	void m1() throws InterruptedException {
		System.out.println("throws keyword D");

	}

	static class F {
		static void m2() throws ClassNotFoundException {
			System.out.println("throws keyword F");

		}
	}
}

class G extends AA {
	void m1() {
		try {
			F.m2();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}