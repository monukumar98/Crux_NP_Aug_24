package Lec17;

public class Board_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		print(n, "", 0);

	}

	public static void print(int n, String ans, int curr) {
		if (curr == n) {
			System.out.println(ans);
			return;
		}
		if (curr > n) {
			return;
		}
		for(int dice=1; dice<=3; dice++) {
			print(n, ans+dice, curr+dice);
		}
//		print(n, ans + 1, curr + 1);
//		print(n, ans + 2, curr + 2);
//		print(n, ans + 3, curr + 3);
		

	}

}
