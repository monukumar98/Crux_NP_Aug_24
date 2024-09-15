package Lec2;

public class Advance_Lottery_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 412;
		if (n >= 300 && n <= 500) {
			System.out.println("Apne car jita hai ");
			// car konsa hoga
			if(n>=300 && n<=400) {
				System.out.println("Thar");
			}
			else {
				System.out.println("Creta");
			}

		} else if (n >= 16 && n <= 25) {
			System.out.println("Apne Cycle jita hai");
			if(n>=16 && n<=20) {
				System.out.println("Ladka wala Cycle");
			}
			else {
				System.out.println("Ladki wala Cycle");
			}
			
			
		} else if (n >= 1000 && n <= 1200) {
			System.out.println("Apne Chips jita hai");
			if(n>=1000 && n<=1100) {
				System.out.println("Red mirchi chips");
			}
			else {
				System.out.println("Chips");
			}
			
		}
		else if (n >= 40 && n <= 50) {
			System.out.println("mirchi");
		} 
		
		else if (n >= 10 && n <= 15) {
			System.out.println("Apne Mac jita hai");
			if(n>=10 && n<=12) {
				System.out.println("M1 Mac");
			}
			else {
				System.out.println("M2 Mac");
			}
		}
		else {
			System.out.println("Happy BirthDay");
		}
	}

}
