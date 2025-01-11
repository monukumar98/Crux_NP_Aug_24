package Lec29;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(12, 8));
		// add(6, 7);
		System.out.println(add(12, 8.8));
		System.out.println(add(12, 8, 9));
		System.out.println(add(12, 8l));
		System.out.println(add(2, 3, 1, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3));

	}
//
//	public static void add(int a, int b) {
//
//	}
	public static int add(int... x) {
		int sum = 0;
		for (int i = 0; i < x.length; i++) {
			sum += x[i];
		}
		return sum;
	}

	public static int add(int a, int b) {
		return a + b;

	}

	public static int add(int a, int b, int c) {
		return a + b + c;
	}

	public static int add(int a, double b) {
		return (int) (a + b);
	}

	public static int add(int a, long b) {
		return (int) (a + b);
	}

}
