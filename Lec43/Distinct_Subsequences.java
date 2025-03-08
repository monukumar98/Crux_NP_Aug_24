package Lec43;

public class Distinct_Subsequences {

	public static void main(String[] args) {
		String s = "rabbbit";// coin-->i
		String t = "rabbit";// amount-->j
		System.out.println(Count_Subsequences(s, t, 0, 0));

	}
	public static int Count_Subsequences(String coin, String amount,int i,int j) {
		if(j==amount.length()) {
			return 1;
		}
		if(i==coin.length()) {
			return 0;
		}
		int inc=0,exc=0;
		if(coin.charAt(i)==amount.charAt(j)) {
			inc=Count_Subsequences(coin, amount, i+1, j+1);
		}
		exc=Count_Subsequences(coin, amount, i+1, j);
		return inc+exc;
	}

}
