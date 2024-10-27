package Lec13;

public class Time_and_Sapce_Complexity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7890;
//		long start = System.currentTimeMillis();
//		for (int i = 0; i < 1000_000; i++) {
//
//		}
//		long end = System.currentTimeMillis();
//		System.out.println(end - start);
//		System.out.println("Hello");
//		System.out.println("Hello");
//		System.out.println("Hello");
//		System.out.println("Hello");
//		System.out.println("Hello");
		// linear search O(N)
		// Binary Search O(log(N) base 2)
		int i = 0;
		while (i < n) {
			System.out.println("Hey");
			// O(N)
			i++;
		}
		while (i < n) {
			System.out.println("Hey");
			// O(log(N)) base 2
			i *= 2;
		}
		while (n > 0) {
			System.out.println("Hey");
			// O(log(N)) base 2
			n /= 2;
		}
		while (i <= n) {
			System.out.println("Hey");
			// O(N)
			i += 2;
			i += 3;
		}
		while (i <= n) {
			System.out.println("Hey");
			// O(log(N)) base 6
			i *= 2;
			i *= 3;
		}
		while (n > 0) {
			System.out.println("Hey");
			// O(log(N)) base 6
			n /= 2;
			n /= 3;
		}
		int k = 2;
		while (i <= n) {
			System.out.println("Hey");
			// linear--> N/K
			i += k;
		}
		while (i <= n) {
			System.out.println("Hey");
			// log me jaayega
			// O(log(N)) base k
			i *= k;
		}
		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.println("hey");
				// O(N^2)
			}
		}
		for (i = 1; i * i <= n; i++) {
			// sqrt(N)
			System.out.println("hey");
		}
		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= i * i; j++) {
				for (k = 1; k <= n / 2; k++) {
					// O(N^4)
					System.out.println("hey");
				}
			}
		}
		for (i = 1; i <= n; i *= 2) {
			// O(log(N)) base 2
			System.out.println("hey");
		}

		for (i = n / 2; i <= n; i++) {
			for (int j = 1; j <= n / 2; j++) {
				for (k = 1; k <= n; k = k * 2) {
					// O(N^2Log(N))
					System.out.println("hey");
				}
			}
		}
		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j += i) {
				System.out.println("hey");
				// O(Log(N))
			}
		}
	}

}
