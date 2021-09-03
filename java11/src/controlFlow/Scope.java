package controlFlow;
/**
 * scope (visibility) of a variable in decreasing order
 * static variable > instance variable > local variable.
 * with local variable only final modifier is permitted. Once you initialize the final variable , its value can't be changed.
 * @author adity
 *
 */
public class Scope {
	int a = 10;
	static int b = 20;
	public void m1() {
		int a = 30;
		int b = 40;
		System.out.println(a);
		System.out.println(b);
	//	System.out.println(c); scope of c is limited to m2 method.
	}
	public static void m2(int d) {
		System.out.println(d);
//		System.out.println(c);  scope of c is limited at line no. 23 and onwards till closing bracket.(})
		final int b = 50;
		int c = 60;
		System.out.println(b);
	}
	public static void main(String[] args) {
		m2(30);
		Scope s = new Scope();
		s.m1();
	}
}
