package Lec10;

public class Selection_Sort {
	public static void main(String[] args) {

		int[] arr = { 4, -1, 5, 3, 1, 2 };
		sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		// System.out.println(Min_Iddex(arr, 2));

	}

	public static void sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int mini = Min_Iddex(arr, i);
			int temp = arr[i];
			arr[i] = arr[mini];
			arr[mini] = temp;
		}

	}

	public static int Min_Iddex(int[] arr, int idx) {
		int mini = idx;
		for (int i = idx + 1; i < arr.length; i++) {
			if (arr[i] < arr[mini]) {
				mini = i;
			}
		}
		return mini;

	}

}
