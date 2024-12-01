package Lec19;

public class Key_Paid {
	static String[] keyboard = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "23";
		Print(str, "");

	}

	public static void Print(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		char ch = ques.charAt(0);
		int idx = ch - '0';
		String press = keyboard[idx];
		for (int i = 0; i < press.length(); i++) {
			Print(ques.substring(1), ans + press.charAt(i));

		}

	}
}
