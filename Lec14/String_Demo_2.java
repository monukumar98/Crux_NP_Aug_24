package Lec14;

public class String_Demo_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello" + 10 + 20 + "bye");
		System.out.println("hello" + (10 + 20) + "bye");
		System.out.println(10 + 20 + "hello" + "bye");
		String s1 = "hello";
		String s2 = new String("hello");
		System.out.println(s1 == s2);
		int a1 = 9;
		int a2 = 9;
		System.out.println(a1 == a2);
		int len = s1.length();
		int[] arr = new int[4];
		int l = arr.length;

	}

}
