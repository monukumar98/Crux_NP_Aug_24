package Lec14;

//import java.util.Arrays;

public class Reverse_Words_in_a_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "   the sky is        blue      ";
		System.out.println(Reverse_Words(s));

	}

	public static String Reverse_Words(String s) {
		s = s.trim();
		String[] arr = s.split(" +");
		// System.out.println(Arrays.toString(arr));
		String ans = "";
		for (int i = arr.length - 1; i >= 0; i--) {
			ans = ans + arr[i]+" ";
		}
		return ans.trim();

	}
}
