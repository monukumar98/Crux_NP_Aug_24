package Lec18;

public class Count_SubSequnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "abc";
		// int ans = Count(ques, "");
		// System.out.println();
		System.out.println("\n" + Count(ques, ""));
		// System.out.println(count);

	}

	/// static int count = 0;

	public static int Count(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.print(ans + " ");
			// count++;
			return 1;
		}
		char ch = ques.charAt(0);
		int x = Count(ques.substring(1), ans);
		int y = Count(ques.substring(1), ans + ch);
		return x + y;

	}

}
