package Lec40;

public class Kartik_Bhaiya_And_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aaaabaaabaaabaaaba";
		int k = 2;
		int flipa = MaximumLength(str, k, 'a');
		int flipb = MaximumLength(str, k, 'b');
		System.out.println(Math.max(flipa, flipb));
	}

	public static int MaximumLength(String str, int k, char ch) {
		// TODO Auto-generated method stub
		int si = 0, ei = 0, flip = 0, ans = 0;
		while (ei < str.length()) {
			// grow
			if (str.charAt(ei) == ch) {
				flip++;
			}
			// shrink
			while (flip > k && si <= ei) {
				if (str.charAt(si) == ch) {
					flip--;
				}
				si++;
			}

			// ans update
			ans = Math.max(ans, ei - si + 1);
			ei++;
		}
		return ans;
	}

}



