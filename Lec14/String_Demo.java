package Lec14;

public class String_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "hello";
		String s2 = "hello";
		String s3 = new String("hello");
		String s4 = new String("hello");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		s1 = s1 + "bye"; //s1.concat("bye");
		String s6="Hello"+"Bye";
		System.out.println(s6);

	}

}
