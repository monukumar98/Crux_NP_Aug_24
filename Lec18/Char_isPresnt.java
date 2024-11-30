package Lec18;

public class Char_isPresnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "gfajhkjhkjaavn";
		System.out.println(isPresnt(s, 'a', 2));

	}

	public static boolean isPresnt(String s, char ch, int idx) {
		for (int i = idx+1; i < s.length(); i++) {
			if(s.charAt(i)==ch) {
				return true;
			}
		}
		return false;

	}

}
