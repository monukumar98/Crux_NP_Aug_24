package Lec44;

public class Wine_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] wine = { 2, 3, 5, 1, 4 };
		System.out.println(maximum_profit(wine, 0, wine.length - 1, 1));

	}

	public static int maximum_profitBU(int[] wine) {
		int[][] dp = new int[wine.length][wine.length];
		int year = wine.length;
		for (int i = 0; i < dp.length; i++) {
			dp[i][i] = wine[i] * year;
		}
		year--;
		for (int d = 1; d < wine.length; d++) {
			for (int j = d; j < wine.length; j++) {
				int i = j - d;
				int f = wine[i] * year + dp[i + 1][j];
				int l = wine[j] * year + dp[i][j - 1];
				dp[i][j] = Math.max(f, l);
			}
			year--;
		}
		return dp[0][dp.length - 1];

	}

	public static int maximum_profit(int[] wine, int i, int j, int year) {
		if (i > j) {
			return 0;
		}
		int f = wine[i] * year + maximum_profit(wine, i + 1, j, year + 1);
		int l = wine[j] * year + maximum_profit(wine, i, j - 1, year + 1);
		return Math.max(f, l);
	}

}
