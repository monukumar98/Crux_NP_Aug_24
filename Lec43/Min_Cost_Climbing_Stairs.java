package Lec43;

public class Min_Cost_Climbing_Stairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 100, 1, 1, 1, 100, 1, 1, 100, 1 };
		int zero=Min_Cost_Climbing(arr, 0);
		int one =Min_Cost_Climbing(arr, 1);
		System.out.println(Math.min(zero, one));
	}
	public static int Min_Cost_Climbing(int []arr,int i) {
		if(i>=arr.length) {
			return 0;
		}
		int f=Min_Cost_Climbing(arr, i+1);
		int s=Min_Cost_Climbing(arr, i+2);
		return Math.min(f, s)+arr[i];
	}

}
