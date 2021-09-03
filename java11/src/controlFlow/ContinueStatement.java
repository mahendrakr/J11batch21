package controlFlow;

public class ContinueStatement {

	public static void main(String[] args) {
		
		int i = 0;
		int j = 0;
		CLC:
		for (System.out.println("tulsi " + j); j<2;System.out.println("sailu " + j++)) {
			System.out.println("shreya");
		for(System.out.println("aadi "  + i);i<5; System.out.println(i++)) {
			if(i%2==0)
				continue CLC;
			System.out.println(i);
		}
		}
	}

}
