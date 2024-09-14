package Lec1;

public class Inc_Dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 8;
		// x++; --> x= x+1;
		// ++x; --> x= x+1;
//		System.out.println(x++);//8
//		System.out.println(x);//9
//		System.out.println(--x);//7
//		System.out.println(x);//7
		int a = x++ + --x + 7 - ++x - --x;
		System.out.println(a);// 6

	}

}