package Lec15;

public class Finding_CB_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "81615";
printallsubstring(s);
	}

	public static void printallsubstring(String s) {
		int c = 0;
		for (int len = 1; len <= s.length(); len++) {
			for (int j = len; j <= s.length(); j++) {
				int i = j - len;
				long x = Long.parseLong(s.substring(i, j));
				if (isCB_Numbers(x) == true) {
					c++;
				}

			}
		}
		System.out.println(c);
	}

	public static boolean isCB_Numbers(long nums) {
		if (nums == 0 || nums == 1) {
			return false;
		}
		int[] arr = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
		for (int i = 0; i < arr.length; i++) {
			if (nums == arr[i]) {
				return true;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (nums % arr[i] == 0) {
				return false;
			}
		}
		return true;
	}

}
