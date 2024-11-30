package Lec18;

public class Permutation_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "abac";
		print(ques, "");

	}

	public static void print(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}

		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			if (isPresnt(ques, ch, i) == false) {
				String s1 = ques.substring(0, i);
				String s2 = ques.substring(i + 1);
				print(s1 + s2, ans + ch);
			}
		}
	}

	public static boolean isPresnt(String s, char ch, int idx) {
		for (int i = idx + 1; i < s.length(); i++) {
			if (s.charAt(i) == ch) {
				return true;
			}
		}
		return false;

	}

}
