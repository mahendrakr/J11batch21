package java11;

public class MethodBasedOnBothReturnAndArguement {
	String animal(String name , int age , int legs) {
		System.out.println(name);
		System.out.println(age);
		System.out.println(legs);
		return name;
		
	}
	public static void main(String[] args) {
		MethodBasedOnBothReturnAndArguement arg = new MethodBasedOnBothReturnAndArguement();
		String animal = arg.animal("lion", 20, 4);
	}
	
}
