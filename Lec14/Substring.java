package Lec14;

public class Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "codingblocks";
		// System.out.println(s.substring(2, 7));
		System.out.println(s.substring(2));
		// printallsubstring(s);
	}

	public static void printallsubstring(String s) {
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				String str = s.substring(i, j);
				System.out.println(str);
			}
		}
	}

}
