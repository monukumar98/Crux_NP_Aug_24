package Lec7;

public class Function_Demo_4 {
	static int val = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hey");
		int a = 8;
		int b = 7;
		System.out.println(val);
		System.out.println(Add(b, a));// 16
		System.out.println(val);
		System.out.println("bye");

	}

	public static int Add(int a, int b) {

		int c = a + b;
		int val = 90;
		Function_Demo_4.val = Function_Demo_4.val - 5;
		return c - Sub(a, b);

	}

	public static int Sub(int a, int b) {

		int c = a - b;
		return c;

	}

}