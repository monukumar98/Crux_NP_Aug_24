package Lec30;

public class LinkedList {
	class Node {

		int val;
		Node next;
	}

	private Node head;
	private Node tail;
	private int size;

	// O(1)
	public void Addfirst(int item) {
		Node nn = new Node();
		nn.val = item;
		if (size == 0) {
			head = nn;
			tail = nn;

		} else {
			nn.next = head;
			head = nn;

		}
		size++;
	}

	// O(1)
	public void Addlast(int item) {
		if (size == 0) {
			Addfirst(item);
		} else {
			Node nn = new Node();
			nn.val = item;
			tail.next = nn;
			tail = nn;
			size++;
		}
	}

	// O(N)
	public void Addatindex(int k, int item) throws Exception {
		if (k == 0) {
			Addfirst(item);
		} else if (k == size) {
			Addlast(item);
		} else {
			Node nn = new Node();
			nn.val = item;
			Node prev = getNode(k - 1);
			nn.next = prev.next;
			prev.next = nn;
			size++;
		}
	}

	private Node getNode(int k) throws Exception {
		if (k < 0 || k >= size) {
			throw new Exception("Bklol k shai nhi hai ");
		}
		Node temp = head;
		for (int i = 0; i < k; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public void Display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val + "-->");
			temp = temp.next;
		}
		System.out.println(".");

	}

	public int getfirst() {
		return head.val;

	}

	public int getlast() {
		return tail.val;
	}

	public int getatindex(int k) throws Exception {
		return getNode(k).val;
	}

	// O(1)
	public int removefirst() {
		int val = head.val;
		if (size == 1) {
			head = null;
			tail = null;
		} else {
			Node temp = head;
			head = head.next;
			temp.next = null;

		}
		size--;
		return val;
	}

	// O(N)
	public int removelast() throws Exception {

		if (size == 1) {
			return removefirst();
		} else {

			Node prev = getNode(size - 2);
			int val = tail.val;
			tail = prev;
			tail.next = null;
			size--;
			return val;
		}

	}

	// O(N)
	public int removeatindex(int k) throws Exception {
		if (k == 0) {
			return removefirst();
		} else if (k == size - 1) {
			return removelast();
		} else {
			Node curr = getNode(k);
			Node prev = getNode(k - 1);
			prev.next=curr.next;
			curr.next=null;
			size--;
			return curr.val;
		}
	}
}














