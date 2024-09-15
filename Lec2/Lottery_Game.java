package Lec2;

public class Lottery_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 212;
		if (n >= 300 && n <= 500) {
			System.out.println("car");
		} else if (n >= 16 && n <= 25) {
			System.out.println("Cycle");
		} else if (n >= 1000 && n <= 1200) {
			System.out.println("Chips");
		} else if (n >= 40 && n <= 50) {
			System.out.println("mirchi");
		} else if (n >= 10 && n <= 15) {
			System.out.println("Mac");
		} 
		else {
			System.out.println("Happy BirthDay");
		}

	}

}
