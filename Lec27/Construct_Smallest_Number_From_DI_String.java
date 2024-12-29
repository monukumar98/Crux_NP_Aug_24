package Lec27;

import java.util.Arrays;
import java.util.Stack;

public class Construct_Smallest_Number_From_DI_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "IIIDIDDD";
		System.out.println(smallest_Number(s));
	}

	public static String smallest_Number(String pattern) {
		int[] ans = new int[pattern.length() + 1];
		int count = 1;
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i <= pattern.length(); i++) {
			if (i == pattern.length() || pattern.charAt(i) == 'I') {
				ans[i] = count++;
				while (!st.isEmpty()) {
					ans[st.pop()] = count++;
				}
			} else {
				st.push(i);// "D"
			}

		}
		String str = "";
		for (int v : ans) {
			str = str + v;
		}
		return str;
	}
}
