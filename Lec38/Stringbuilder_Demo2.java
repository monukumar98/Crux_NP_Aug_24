package Lec38;

public class Stringbuilder_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String_Add();
		Stringbuilder_Add();

	}

	public static void String_Add() {
		String s = "";
		for (int i = 0; i < 100000; i++) {
			s = s + i;
		}
		System.out.println("Bye");
	}

	public static void Stringbuilder_Add() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 100000; i++) {
			sb.append(i);
		}
		System.out.println("Bye");
	}

}
