package Lec44;

public class Minimum_Path_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } };
		System.out.println(Path_Sum(grid, 0, 0));
	}

	public static int Path_Sum(int[][] grid, int cr, int cc) {
		if (cr == grid.length - 1 && cc == grid[0].length - 1) {
			return grid[cr][cc];
		}
		if(cr>=grid.length|| cc>=grid[0].length) {
			return Integer.MAX_VALUE;
		}
		int down = Path_Sum(grid, cr + 1, cc);
		int right = Path_Sum(grid, cr, cc + 1);
		return Math.min(down, right) + grid[cr][cc];

	}
}







