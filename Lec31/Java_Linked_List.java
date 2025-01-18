package Lec31;

import java.util.Iterator;
import java.util.LinkedList;

public class Java_Linked_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(10);// addlast
		ll.addFirst(20);
		ll.add(30);
		ll.add(1, -9);// 1st index pe -9 add kr deag
		System.out.println(ll);
		System.out.println(ll.size());
		System.out.println(ll.get(1));
//		System.out.println(ll.remove());// remove first
//		System.out.println(ll.removeLast());// remove last
//		System.out.println(ll.remove(1));// reamove at index
		System.out.println(ll);
		for (int i = 0; i < ll.size(); i++) {
			System.out.print(ll.get(i) + " ");
		}
		System.out.println();
		// address
		Iterator<Integer> a = ll.iterator();
		while(a.hasNext()) {
			System.out.print(a.next()+" ");
			
		}

	}

}













