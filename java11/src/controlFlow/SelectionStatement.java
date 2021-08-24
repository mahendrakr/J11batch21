package controlFlow;

public class SelectionStatement {

	public static void main(String[] args) {
		//voting machine___if/else;
		int age = 17;
		if(age>=18) {
			System.out.println("you can cast your vote");
		}
		else{
			System.out.println("you can not cast your vote");
		}
		int a = 972;
		if(a<100) {
			if(a%2==0) {
				System.out.println("the given no. is even");
			}
			else {
				System.out.println("the given no. is odd");
			}
		}
		else {
			System.out.println("not a valid no.");
		}
		int i = 85;
		String result = i<100?(i%2==0?"even":"odd"):"invalid input";
		System.out.println(result);
		int score = 50;
		if(score >50) {
			System.out.println("A grade hero");
		}
		else if(score>40||score<50) {
			System.out.println("B grade hero");
		}
		else if(score>30||score<40) {
			System.out.println("C grade hero");
		}
		else {
			System.out.println("you're a duffer");
		}
		}

}
