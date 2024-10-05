package Lec7;

public class Function_Demo_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hey");
		int a = 8;
		int b = 7;
//		int x=Add(b, a);
//		System.out.println(x);
		System.out.println(Add(b, a));
		System.out.println("bye");

	}

	public static int Add(int a, int b) {

		int c = a + b;
		return c - Sub(a, b);
		
	}

	public static int Sub(int a, int b) {

		int c = a - b;
		return c;
	}
}
