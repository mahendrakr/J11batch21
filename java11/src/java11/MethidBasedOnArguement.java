package java11;

public class MethidBasedOnArguement {
	void m1 () {
	}
	
	void m2(int a) {
		System.out.println(a);
	}
	
	void m3(int a , float b) {
		System.out.println(a);
		System.out.println(b);
	}
	String m4(String name , int age , float phone) {
		System.out.println(name);
		System.out.println(age);
		System.out.println(phone);
		return name;
	}
	 public static void main(String[] args) {
		 MethidBasedOnArguement arg = new MethidBasedOnArguement();
		 arg.m2(10);
		 arg.m3(7, 10.0f);
		 String name = arg.m4("aadi" , 18 , 88732824);  
	 }
}