package Lec30;

public class Intersection_of_Two_Linked_Lists {
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public class Solution {
		public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

			ListNode g = headA;
			ListNode vgf = headB;
			while (g != vgf) {
				if (vgf == null) {
					vgf = headA;

				} else {
					vgf = vgf.next;
				}
				if (g == null) {
					g = headB;
					
				} else {
					g = g.next;
				}
			}
			return vgf;
		}
	}
}
