package Lec16;

public class Wrapper_Class_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1 = 10;
		Integer a2 = 10;
		System.out.println(a1);
		System.out.println(a2);
		char ch = 'a';
		Character ch1 = 'a';
		System.out.println(ch);
		System.out.println(ch1);
		long l = 19;
		Long l1 = 90l;
		int x = 9;
		Integer x1 = x;// auto-Boxing

		int b = a2;// Un-boxing
		Integer c1 = 10;
		Integer c2 = 10;
		Integer c3 = 178;
		Integer c4 = 178;
		System.out.println(c1 == c2);
		System.out.println(c3 == c4);
		Character ch2='z';
		Character ch3='z';
		System.out.println(ch2==ch3);
		Boolean b4=false;
		Boolean b5=false;
		System.out.println(b4==b5);
		

	}

}
















