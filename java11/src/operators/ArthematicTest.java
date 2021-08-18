package operators;

public class ArthematicTest {

	public static void main(String[] args) {
		ArthematicOperator ao = new ArthematicOperator();
		int sum = ao.addv2(10, 20);
		System.out.println(sum);
		int divide = ao.divide(20, 10);
		System.out.println(divide);
		int subtract = ao.subtract(20, 10);
		System.out.println(subtract);
		int multiply = ao.multiply(2, 8);
		System.out.println(multiply);
		System.out.println(12/3);
		System.out.println(12%3);
		
		System.out.println(-10.0/0);	
		System.out.println(10.0/0);
		//System.out.println(10/0);
		//System.out.println(0/0.0);
		//System.out.println(0.0/0);
		//System.out.println(-0/0.0);
		//System.out.println(-0.0/0);
		
		System.out.println("aadi" + 30);
		System.out.println(10+30);
		System.out.println(10+20+30+ "shreya");
		System.out.println("aadi"+10+20+30);
		System.out.println(10+20+"sneha"+30+40);
	}

}
