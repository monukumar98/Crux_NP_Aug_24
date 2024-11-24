package Lec17;

import java.util.ArrayList;

public class ArraysList_Demo2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ll = new ArrayList<>();
		// add
		ll.add(10);
		ll.add(20);
		ll.add(78);
		ll.add(5);
		ll.add(9);
		ll.add(23);
		ll.add(51);
		ll.add(19);
		ll.add(2);
		System.out.println(ll);
		for (int i = 0; i < ll.size(); i++) {
			System.out.print(ll.get(i) + " ");
		}
		System.out.println();
		boolean[] arr = new boolean[5];
		for (int x : ll) {
			System.out.print(x + " ");
			
		}
		System.out.println();
		for (boolean x : arr) {
			System.out.print(x + " ");
		}

	}
}









