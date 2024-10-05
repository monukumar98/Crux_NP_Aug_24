package Lec7;

public class Function_Demo_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hey");
		int a = 8;
		int b = 7;
		Add(b, a);
		System.out.println("bye");

	}

	public static void Add(int a, int b) {

		int c = a + b;
		Sub(c, b);
		System.out.println(c);
	}

	public static void Sub(int a, int b) {

		int c = a - b;
		System.out.println(c);
	}
}
