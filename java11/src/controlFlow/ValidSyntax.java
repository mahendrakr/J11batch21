package controlFlow;

public class ValidSyntax {
	public static void main(String[] args) {
		//valid syntax of for loop
		int a = 0;
		for(System.out.println("aadi");a<10;System.out.println(a++)) {
			System.out.println("inside body");
		}
		for(int i = 0;i<5;i++); //valid but not useful
		int i = 0;
		for(i=5;i<10;i++); //valid but not useful
		//for(;;); //valid but not useful
	//	for(;true;); //valid but not useful
		//for(;false;); // not valid
		//System.out.println("not u");
		/*for(;false;) {	//invalid
		}*/
		System.out.println("*********************");
		for(int b= 1;b<5;b++)
			System.out.println(b);
		int c = 10;
		for(;c>20;c++) {
			
		}
		
	
	}
}
