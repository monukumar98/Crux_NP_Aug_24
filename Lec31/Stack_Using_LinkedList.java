package Lec31;

import java.util.LinkedList;

public class Stack_Using_LinkedList {
	private LinkedList<Integer> ll = new LinkedList<>();

	public void push(int item) {
		ll.addFirst(item);
	}

	public int pop() {
		return ll.remove();// remove fisrt
	}

	public int size() {
		return ll.size();
	}

	public int peek() {
		return ll.getFirst();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
