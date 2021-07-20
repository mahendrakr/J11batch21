package java11;

public class Teacher {
	static int a;
	int b;
	static {
		System.out.println("static block loaded");

	}
	{
		System.out.println("instance block loaded");
	}

	public static void main(String[] args) {
		Teacher t = new Teacher();
		Teacher t1 = new Teacher();
	}
}
