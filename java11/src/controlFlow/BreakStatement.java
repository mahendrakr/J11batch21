package controlFlow;
// write a program of a prime no. ?
// write difference b/w return and break ?
// you can use break only inside loop or a switch statement.
// continue can only be used with loops.
public class BreakStatement {
	 public static void main(String[] args) {
		 CLC:
		 for(int j = 0;j<2;j++) {
			 System.out.println("aadi");
		for(int i=0;i<3;i++) {
			if(i == 2)
				break CLC;
			System.out.println(i);
		}
		System.out.println("shreya");
		 }
	//	if(10>5)
		//	break;
		//	continue;
	}
}
