package Lec17;

public class Coin_Toss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		print(n, "");

	}

	public static void print(int n, String ans) {
		if (n == 0) {
			System.out.println(ans);
			return;
		}
		print(n - 1, ans + "H");
		print(n - 1, ans + "T");

	}

}
