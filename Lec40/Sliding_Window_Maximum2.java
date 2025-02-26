package Lec40;

import java.util.*;

public class Sliding_Window_Maximum2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 3, -1, -3, 5, 3, 6, 7 };
		int k = 3;

	}

	public static int[] Window_Maximum(int[] arr, int k) {
		int n = arr.length;
		int[] max_val = new int[n - k + 1];
		Deque<Integer> ll = new LinkedList<>();
		// 1st window ka maximum
		for (int i = 0; i < k; i++) {
			while (!ll.isEmpty() && arr[ll.getLast()] < arr[i]) {
				ll.removeLast();
			}
			ll.add(i);
		}
		int j = 0;
		max_val[j++] = arr[ll.getFirst()];
		for (int i = k; i < arr.length; i++) {
			// grow
			while (!ll.isEmpty() && arr[ll.getLast()] < arr[i]) {
				ll.removeLast();
			}
			ll.add(i);
			// shrink
			if (ll.getFirst() == i - k) {
				ll.removeFirst();
			}

			// ans upadte
			max_val[j++] = arr[ll.getFirst()];

		}
		return max_val;

	}

}
