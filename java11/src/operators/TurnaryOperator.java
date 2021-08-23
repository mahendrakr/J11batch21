package operators;

public class TurnaryOperator {
	public String getGender(String name) {
		String gender = name.equals("aadi") ? "male" : "female";
		return gender;
	}

	public static void main(String[] args) {
		TurnaryOperator to = new TurnaryOperator();
		String gender = to.getGender("aadi");
		System.out.println(gender);
		int i = 80;
		boolean result = i<100?true:false;
		boolean result2 = i<100?(i%3==0?true:false):false;
		System.out.println(result2);
		
		int a = 2512;
		boolean result3 = a<1000?(a%2==0?true:false):false;
		System.out.println(result3);
		
		int b = 7;
		String s = b%2==0?"even":"odd";
		System.out.println(s);
	}

}
