package operators;

public class AssignmentOperator {

	public static void main(String[] args) {
		int a,b,c ;
		a=b=c=20;
		//int x=a=b=c=10; you can not perform chained assignment at the time of declaration.
		//compound assignment operator :
		int x = 10;
		int y = x+1;
		y=y++;
		y= y+1;
		y+=1;
		//int p+=1; //invalid statement , compile time error.
		y-=1;
		y*=1;
		y/=2;
		y%=2;
		System.out.println(y);
	}

}
