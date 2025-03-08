package Lec43;

public class Edit_Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "FOOD";
		String t = "MONEY";
		System.out.println(Min_oprs(s, t, 0, 0));
	}

	public static int Min_oprs(String s, String t, int i, int j) {
		if(j==t.length()) {
			return s.length()-i;
		}
		if(i==s.length()) {
			return t.length()-j;
		}
		int ans = 0;
		if (s.charAt(i) == t.charAt(j)) {
			ans = Min_oprs(s, t, i + 1, j + 1);
		} else {
			int D = Min_oprs(s, t, i + 1, j);
			int I = Min_oprs(s, t, i, j + 1);
			int R = Min_oprs(s, t, i + 1, j + 1);
			ans = Math.min(I, Math.min(D, R))+1;
		}
		return ans;

	}

}
