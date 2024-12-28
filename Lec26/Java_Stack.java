package Lec26;

import java.util.Stack;

public class Java_Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		System.out.println(st.capacity());
		// add
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		// get
		System.out.println(st.peek());
		// remove
		System.out.println(st);
		System.out.println(st.pop());
		System.out.println(st);
		System.out.println(st.isEmpty());
		System.out.println(st.size());
		for (int v : st) {
			System.out.print(v + " ");
		}
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		st.push(50);
		st.push(50);
		System.out.println();
		System.out.println(st.capacity());
	}

}
