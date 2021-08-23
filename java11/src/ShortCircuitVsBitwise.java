
public class ShortCircuitVsBitwise {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		if (x++ < ++y && x++ < y) {
			System.out.println(x + " " + y );
		}
		else {
			System.out.println(x + " " + y );
		}
	}

}
