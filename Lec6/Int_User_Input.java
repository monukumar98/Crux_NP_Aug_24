package Lec6;

import java.util.Scanner;

public class Int_User_Input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		byte b = sc.nextByte();
		short s = sc.nextShort();
		int i = sc.nextInt();
		long l = sc.nextLong();
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
	}
}
