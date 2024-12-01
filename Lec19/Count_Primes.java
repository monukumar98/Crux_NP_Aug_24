package Lec19;

public class Count_Primes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100;
		int c = 0;
		for (int i = 2; i < n; i++) {
			if (isprime(i)) {
				c++;
			}
		}
		System.out.println(c);

	}

	public static boolean isprime(int n) {
		int div = 2;
		while (div * div <= n) {
			if (n % div == 0) {
				return false;
			}

			div++;
		}
		return true;
	}

}
