package Lec37;

import java.util.PriorityQueue;

public class Kth_Largest_Element_in_an_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 3, 2, 3, 1, 2, 4, 5, 5, 6 };
		int k = 4;
		System.out.println(Kth_Largest(nums, k));
	}

	public static int Kth_Largest(int[] nums, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int i = 0; i < k; i++) {
			pq.add(nums[i]);
		}
		for (int i = k; i < nums.length; i++) {
			if (nums[i] >= pq.peek()) {
				pq.poll();
				pq.add(nums[i]);
			}
		}
		return pq.peek();
	}
}

