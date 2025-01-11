package Lec29;

import java.util.Arrays;

public class Student {

	String name = "Kaju";
	int age = 22;

	public Student(String name, int age) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return name + " " + age;
	}

	public static void main(String[] args) {
		Student s = new Student("Raj", 22);
		Student s1 = new Student("Ankit", 23);
		int [] arr  = new int [7];
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(s);
		System.out.println(s1);
	}
}
