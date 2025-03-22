package Lec44;

import java.util.Arrays;

public class Minimum_Falling_Path_Sum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = { { 2, 1, 3 }, { 6, 5, 4 }, { 7, 8, 9 } };
		int ans = Integer.MAX_VALUE;
		int[][] dp = new int[matrix.length][matrix[0].length];
		for (int[] a : dp) {
			Arrays.fill(a, 786789);
		}
		for (int i = 0; i < matrix[0].length; i++) {
			ans = Math.min(ans, Path_Sum(matrix, 0, i, dp));
		}
		System.out.println(ans);
	}

	public static int Path_Sum(int[][] grid, int cr, int cc, int[][] dp) {
		if(cr==grid.length-1) {
			return grid[cr][cc];
		}
		if(dp[cr][cc]!=786789) {
			return dp[cr][cc];
		}
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < grid[0].length; i++) {
			if (cc != i) {
				ans = Math.min(ans, Path_Sum(grid, cr + 1, i, dp));
			}
		}
		return dp[cr][cc]=grid[cr][cc] + ans;
	}

}




