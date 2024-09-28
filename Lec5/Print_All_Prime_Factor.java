package Lec5;

public class Print_All_Prime_Factor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 774;
		int i=2;
		while(i<=n) {
			if(n%i==0) {
				System.out.println(i);
				n=n/i;
			}
			else {
				i++;
			}
		}

	}

}
