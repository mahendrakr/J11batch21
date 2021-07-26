package java11;
//NOTE = IF YOU WANT TO CALL STATIC MEMBERS IN THE SAME CLASS , THEN ONLY MEMBER NAME IS ENOUGH TO CALL.
public class CallStaticMembers {
	static int a = 10 ;
	static float b = 20;
	static String str= "JAVA";
	static char c = 'A';
	static boolean d = true ;
	
	static void m1 () {
		System.out.println("m1 method");
	}
	static void m2(int p) {
		System.out.println(p);
	}
	static void m3(int q , long r) {
		System.out.println(q);
		System.out.println(r);
	}
	static String m4(String name , String shade , int age ) {
		System.out.println(name);
		System.out.println(shade);
		System.out.println(age);
		return shade;
	}
	static String m5 (String carName , String color , int headlights) {
		System.out.println(carName);
		System.out.println(color);
		System.out.println(headlights);
		return carName;
	}
	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(str);
		System.out.println(c);
		System.out.println(d);
		System.out.println(CallStaticMembers.a);
		m3(70, 80);
		m2(7);
		m4("messi", "white", 31);
		m5("verna", "black", 2);
	}
}
