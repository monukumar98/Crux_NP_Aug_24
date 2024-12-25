package Lec25;

//import java.util.ArrayList;

public class StudentClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList<Integer> ll = new ArrayList<>();
		System.out.println("Welcome ");
		Student s = new Student();
		s.name = "kaju";
		s.age = 20;
		s.Intro_yourSelf();
		Student s1 = new Student();
		s1.name = "Raj";
		s1.age = 21;
		s1.Intro_yourSelf();
		s.SayHey("Ramesh");
		System.out.println(s.MentorName());
		System.out.println(Student.MentorName());

	}
	static {
		System.out.println("I am in Static  Block Main");
	}

}
