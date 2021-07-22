package java11;

public class MethodBasedOnReturnType {
	//Methods based on return type
			 void m1(){System.out.println("m1 method");}
			 
			 int m2(){
			return 10;
			}
			 long m3(){
			return 20;
			}
			 float m4(){
			return 40;
			}
			 char m5(){ 
			return 'c';
			}
			 double m6(){
			return 200;
			}
			boolean m7(){
			return true;
			}
			short m8(){
			return 50;
			}
			 byte m9(){
			return 60;
			}
			 String m10(){
			return "happy birthday shreya";
			}
			 public static void main(String[] args) {
			MethodBasedOnReturnType type = new MethodBasedOnReturnType();
			type.m1();
			int m2 = type.m2();
			System.out.println(m2);
			long m3 = type.m3();
			System.out.println(m3);
			float m4 = type.m4();
			System.out.println(m4);
			char m5 = type.m5();
			System.out.println(m5);
			double m6 = type.m6();
			System.out.println(m6);
			boolean m7 = type.m7();
			System.out.println(m7);
			short m8 = type.m8();
			System.out.println(m8);
			byte m9 = type.m9();
			System.out.println(m9);
			String m10 = type.m10();
			System.out.println(m10);
			
			}

}
