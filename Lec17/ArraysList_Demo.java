package Lec17;

import java.util.ArrayList;
import java.util.Collections;

public class ArraysList_Demo {

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
		ll.add(1, 7);
		System.out.println(ll);
		System.out.println(ll.get(3));
		System.out.println(ll.remove(2));
		System.out.println(ll);
		System.out.println(ll.size());
		ll.set(2, 19);
		Collections.sort(ll);
		Collections.reverse(ll);
		System.out.println(ll);

	}

}












