package Lec21;

public class Coin_Combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coin = { 2,3,6,7};
		int amount = 7;
		Combination(coin, amount, "", 0);

	}

	public static void Combination(int[] coin, int amount, String ans, int idx) {
		if (amount == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = idx; i < coin.length; i++) {
			if (amount >= coin[i]) {
				Combination(coin, amount - coin[i], ans + coin[i], i);
			}
		}

	}
}
