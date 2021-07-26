package java11;
/**
 * execution order within a class
 * A.static members
 *   1.static block, static variable(FCFS)
 *   2.main method
 * B.instance members(if object is created)
 *   1.instance block, instance variable(FCFS)
 *   2.constructor
 * NOTE: METHOD(static or non static) WILL ECECUTE WHEN YOU CALL IT
 *
 */
public class ExecutionOrder {
	static {System.out.println("static block3");}
	int a = m1();
	static int b = m3();
	int c;
	static int d;
	static {
		System.out.println("static block1");
	}

	{
		System.out.println("instance block1");
	}

	static {
		System.out.println("static block2");
	}
	{
		System.out.println("instance block2");
	}

	ExecutionOrder() {
		System.out.println("constructor");
	}

	int m1() {
		System.out.println("m1 method");
		return 10;
	}

	void m2() {
		System.out.println("m2 method");
	}

	static int m3() {
		System.out.println("m3 method");
		return 20;
	}

	static void m4() {
		System.out.println("m4 method");
	}

	public static void main(String[] args) {
		System.out.println("main method");
		ExecutionOrder order = new ExecutionOrder();

	}
}
