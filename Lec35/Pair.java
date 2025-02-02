package Lec35;

public class Pair<T, C> {
	T x;
	C y;

	public Pair() {
		// TODO Auto-generated constructor stub
	}

	public Pair(T x, C y) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
	}

	public T getx() {
		return x;
	}

	public C gety() {
		return y;
	}

	public static void main(String[] args) {
		Pair<Integer, Boolean> p = new Pair<>();
		Pair<Character, Boolean> p1 = new Pair<>();
		
	}
}








