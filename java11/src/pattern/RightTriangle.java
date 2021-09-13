package pattern;

public class RightTriangle {

	public static void main(String[] args) {
		int bc = 4;
		int rc = 5;
		int sc = 1;
		for (int i = 0; i < rc; i++) {
			for (int j = 0; j < bc; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < sc; k++) {
				System.out.print("*");
			}
			System.out.println();
			bc--;
			sc++;
		}
	}

}
