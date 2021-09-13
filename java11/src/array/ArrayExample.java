package array;

public class ArrayExample {
	public static void main(String[] args) {
		//declaration
		int[] arr;
		int [] arr1; 
		int arr2[];
		//array construction
		int[] arr3= new int[5];
		long[] arr4 = new long[4];
		double[] arr5 = new double[3];
		String[] arrS = new String[6];
		System.out.println(arrS[1]);
		arrS[0] = "Aadi";
		arrS[1] = "Shreya";
		arrS[2] = "pikachu";
		arrS[3] = "charzard";
		arrS[4] = "shinchan";
		arrS[5] = "kitreshu";
		System.out.println(arrS[0]);
		System.out.println(arrS[5]);
		for(int i = 0;i<6;i++) {
			System.out.println(arrS[i]);
		}
		System.out.println("*****");
		for(int j = 0;j<arrS.length;j++) {
			System.out.println(arrS[j]);
		}
		System.out.println("******");
		arr3[0] = 10;
		arr3[1] = 20;
		arr3[2] = 30; 
		arr3[3] = 40;
		arr3[4] = 50;
		for(int k= 0;k<arr3.length;k++) {
			System.out.println(arr3[k]);
		}
	}
}
