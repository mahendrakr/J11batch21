package operators;

public class EqualityOperator {
public static void main(String[] args) {
	byte b = 10;
	int i = 20;
	short s =30;
	long l = 40;
	double d = 50;
	float ff = 10.0f;
	char c = 'a';
	boolean b1 = true;
	boolean b2 = false;
	System.out.println(b1!=b2);
	Student stu1 = new Student(10, "anu");
	Student stu2 = new Student(10, "anu");
	System.out.println(stu1==stu2);
	String s1 = "anu";
	String s2 = "anu";
	System.out.println(s1==s2);
	String s3 = new String("aadi");
	String s4 = new String("aadi");
	System.out.println(s3==s4);
	System.out.println(s3.equals(s4));
}
}
