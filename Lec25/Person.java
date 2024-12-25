package Lec25;

public class Person {

	private String name = "Kaju";
	private int age = 21;

	public Person() {

	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void fun() {
		System.out.println("Hello Fun");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 0) {
			System.out.println("age nhi hoga ");
			return;
		}
		this.age = age;
	}

//	public String getName() {
//		return this.name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}

}
