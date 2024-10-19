package Lec10;

public class Insertion_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 11, 12, 6, 4, 5, 8, 9 };
		// System.out.println(Insert_Last_Element(arr, arr.length - 1));
		sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void sort(int[] arr) {
		// TODO Auto-generated method stub
		for (int i = 1; i < arr.length; i++) {
			Insert_Last_Element(arr, i);
		}

	}

	public static void Insert_Last_Element(int[] arr, int i) {
		int item = arr[i];
		int j = i - 1;
		while (j >= 0 && arr[j] > item) {
			arr[j + 1] = arr[j];
			arr[j] = item;
			j--;
		}

	}
}
