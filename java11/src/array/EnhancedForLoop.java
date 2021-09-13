package array;

public class EnhancedForLoop {
	public static void main(String[] args) {
		int [] arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		for(int i:arr) {
			System.out.println(i);
		}
		System.out.println("*****");
		String [] arr1 = new String[5];
		arr1[0] = "abc";
		arr1[1] = "def";
		arr1[2] = "ghi";
		arr1[3] = "jkl";
		arr1[4] = "mno";
		for(String s : arr1) {
			System.out.println(s);
		}
		System.out.println(arr1);
	}
}
