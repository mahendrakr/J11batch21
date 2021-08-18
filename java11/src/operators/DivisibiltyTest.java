package operators;
//HW : test no. divisibilty from 2 to 11
public class DivisibiltyTest {

	public static void main(String[] args) {
		DivisibiltyCheck ds = new DivisibiltyCheck();
		boolean db3 = ds.isDivisibleBy3(13);
		System.out.println(db3);
		
		DivisibiltyCheck ds1 = new DivisibiltyCheck();
		boolean db2 = ds1.isDivisibleBy2(4);
		System.out.println(db2);
		
		DivisibiltyCheck ds2 = new DivisibiltyCheck();
		boolean db4 = ds2.isDivisibleBy4(16);
		System.out.println(db4);
		
		DivisibiltyCheck ds3 = new DivisibiltyCheck();
		boolean db5 = ds3.isDivisibleBy5(25);
		System.out.println(db5);
		
		DivisibiltyCheck ds4 = new DivisibiltyCheck();
		boolean db6 = ds4.isDivisibleBy6(36);
		System.out.println(db6);
		
		DivisibiltyCheck ds5 = new DivisibiltyCheck();
		boolean db7 = ds5.isDivisibleBy7(49);
		System.out.println(db7);
		
		DivisibiltyCheck ds6 = new DivisibiltyCheck();
		boolean db8 = ds6.isDivisibleBy8(64);
		System.out.println(db8);
		
		DivisibiltyCheck ds7 = new DivisibiltyCheck();
		boolean db9 = ds7.isDivisibleBy9(81);
		System.out.println(db9);
		
		DivisibiltyCheck ds8 = new DivisibiltyCheck();
		boolean db10 = ds8.isDivisibleBy10(100);
		System.out.println(db10);
		
		DivisibiltyCheck ds9 = new DivisibiltyCheck();
		boolean db11 = ds9.isDivisibleBy11(110);
		System.out.println(db11);
	}

}
