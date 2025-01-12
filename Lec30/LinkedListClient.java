package Lec30;

public class LinkedListClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.Addfirst(10);
		ll.Addfirst(20);
		ll.Addfirst(30);
		ll.Addlast(40);
		ll.Addatindex(2, -9);
		ll.Display();
		System.out.println(ll.getfirst());
		System.out.println(ll.getlast());
		System.out.println(ll.getatindex(2));

	}

}
