package controlFlow;
//write a Program of factorialz
public class ItterativeStatement {
	public void printTable(int n) {
		for(int i = 1;i<=10;i++) {
			System.out.println(n*i);
		}
	}
	public void printSum(int n) {
		int r = n%10;
		int p = n/10;
		System.out.println(r + " " + p);
	}
	 public static void main(String[] args) {
		//for(int i= 0;i<10;i++) {
			//System.out.println("aadi");
		//}
		 ItterativeStatement is = new ItterativeStatement();
		 //is.printTable(5);
		 is.printSum(12345);
		 int i = 1;
		 while(i<10) {
			 System.out.println("aadi");
			 i++;
		 }
	}
}
