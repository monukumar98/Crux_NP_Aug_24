package Lec35;

public class Genercis_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = { 10, 20, 30, 40, 50 };
		String[] arr1 = { "Raj", "Kamlesh", "Ankit", "Ankita" };
		Display(arr);
		Display(arr1);
	}

	public static <T>void Display(T[] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	public static <T>T get(T[] arr) {
		// TODO Auto-generated method stub
		return arr[0];
	}

}
