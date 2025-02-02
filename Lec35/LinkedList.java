package Lec35;

public class LinkedList<T> {
	class Node {

		T val;
		Node next;
	}

	private Node head;
	private Node tail;
	private int size;

	// O(1)
	public void Addfirst(T item) {
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
	public void Addlast(T item) {
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
	public void Addatindex(int k, T item) throws Exception {
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

	public T getfirst() {
		return head.val;

	}

	public T getlast() {
		return tail.val;
	}

	public T getatindex(int k) throws Exception {
		return getNode(k).val;
	}

	// O(1)
	public T removefirst() {
		T val = head.val;
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
	public T removelast() throws Exception {

		if (size == 1) {
			return removefirst();
		} else {

			Node prev = getNode(size - 2);
			T val = tail.val;
			tail = prev;
			tail.next = null;
			size--;
			return val;
		}

	}

	// O(N)
	public T removeatindex(int k) throws Exception {
		if (k == 0) {
			return removefirst();
		} else if (k == size - 1) {
			return removelast();
		} else {
			Node curr = getNode(k);
			Node prev = getNode(k - 1);
			prev.next = curr.next;
			curr.next = null;
			size--;
			return curr.val;
		}
	}
}
