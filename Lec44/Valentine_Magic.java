package Lec44;

import java.util.Arrays;

public class Valentine_Magic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] girls = { 5, 7, 3, 2 };
		int[] boys = { 2, 11, 3 };
		Arrays.sort(girls);
		Arrays.sort(boys);
		System.out.println(Min_diff(girls, boys, 0, 0));

	}

	public static int Min_diff(int[] girls, int[] boys, int i, int j) {
		if (i == boys.length) {
			return 0;
		}
		if (j == girls.length) {
			return 897900;
		}
		int sel = Math.abs(girls[j] - boys[i]) + Min_diff(girls, boys, i + 1, j + 1);
		int rej = Min_diff(girls, boys, i, j + 1);
		return Math.min(sel, rej);
	}

}
