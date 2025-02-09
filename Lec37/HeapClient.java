package Lec37;

import java.util.Collections;
import java.util.PriorityQueue;

public class HeapClient {
	public static void main(String[] args) {
		//Heap hp = new Heap();
//		PriorityQueue<Integer> hp = new PriorityQueue<>();// min
		PriorityQueue<Integer> hp = new PriorityQueue<>(Collections.reverseOrder());// max
		hp.add(10);
		hp.add(20);
		hp.add(30);
		hp.add(5);
		hp.add(7);
		hp.add(3);
		hp.add(2);
//		hp.Display();
		System.out.println(hp);
	}
}
