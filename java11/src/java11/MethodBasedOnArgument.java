package java11;

public class MethodBasedOnArgument {
	void m1() {
	}

	void m2(int a) {
		System.out.println(a);
	}

	void m3(int a, float b) {
		System.out.println(a);
		System.out.println(b);
	}

	String m4(String name, int age, long phone) {
		System.out.println(name);
		System.out.println(age);
		System.out.println(phone);
		return name;
	}
	public static void main(String[] args) {
		MethodBasedOnArgument arg = new MethodBasedOnArgument();
		arg.m2(10);
		arg.m3(30, 25.6f);
		String name = arg.m4("shreya", 32, 62025592);
		System.out.println(name);
	}

}
