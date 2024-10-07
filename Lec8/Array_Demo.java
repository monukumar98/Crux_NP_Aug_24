package Lec8;

public class Array_Demo {
	public static void main(String[] args) {
		int[] arr = new int[5];
		System.out.println(arr);
//		int a[] = new int[5];
		int[] other = arr;
		// set
		arr[0] = 5;
		arr[1] = 7;
		arr[2] = 9;
		arr[3] = 11;
		arr[4] = -3;
		// print
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		//System.out.println(arr[5]);
		System.out.println(other.length);

	}
}
