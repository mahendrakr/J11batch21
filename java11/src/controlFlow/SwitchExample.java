package controlFlow;

public class SwitchExample {
	public static void main(String[] args) {
		int x = 30;
		final int a = 20;
		//2147483647 = int range
		//allowed data type : byte , short , int , char , "Byte , Short , Integer , Character" , enum , String
		//iCe bSs = int Char enum byte String short 
		switch (x) {
		default: {
			System.out.println("non of these");
		}
		case 10: {
			System.out.println("option A");
			break ;
		}
		case a: {
			System.out.println("option B");
			break;
		}
		case 30: {
			System.out.println("option C");
			break ;
		}
		case 40: {
			System.out.println("option D");
			break ;
		}
		}
		/*switch (x) {
		System.out.println("option D"); // not allowed
		}*/
	}
}
