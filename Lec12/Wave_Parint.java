package Lec12;

public class Wave_Parint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 2, 1, 3, 4 }, { 5, 6, 8, 7 }, { 12, 56, 78, 9 } };
		print(arr);
	}

	public static void print(int[][] arr) {
		for (int col = 0; col < arr[0].length; col++) {
			if (col % 2 == 0) {
				for (int row = 0; row < arr.length; row++) {
					System.out.print(arr[row][col] + " ");
				}
			} else {
				for (int row = arr.length - 1; row >= 0; row--) {
					System.out.print(arr[row][col] + " ");

				}
			}
		}

	}
}
