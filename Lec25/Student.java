package Lec25;

//import java.util.ArrayList;

public class Student {
	String name;
	int age;

	public void Intro_yourSelf() {

		System.out.println("My Name is " + this.name + " and age is " + this.age);

	}

	public void SayHey(String name) {
		System.out.println(this.name + " Say hello " + name);

	}

	public static String MentorName() {
		return "Monu Bhaiya";
	}

	static {
		System.out.println("I am in Static  Block");
	}
	static {
		System.out.println("I am in Static  Block1");
	}
}
