package Lec27;

import java.util.Stack;

public class Insert_Last {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println(st);
		Insert(st, 7);
		System.out.println(st);

	}

	private static void Insert(Stack<Integer> st, int item) {
		// TODO Auto-generated method stub
		if (st.isEmpty()) {
			st.push(item);
			return;
		}
		int x = st.pop();
		Insert(st, item);
		st.push(x);

	}

}
