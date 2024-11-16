package Lec14;

public class Substring_lenght_Wise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "codingblocks";
		printallsubstring(s);
	}

	public static void printallsubstring(String s) {
		for (int len = 1; len <= s.length(); len++) {
			for (int j = len; j <= s.length(); j++) {
				int i = j - len;
				System.out.println(s.substring(i, j));

			}
		}
	}

}
