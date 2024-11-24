package Lec17;

public class Maze_Path {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		int n = 3;
		int m = 4;// matrix n*m
		Print(n - 1, m - 1, 0, 0, "");
	}

// er --> end row
// ec --> end col
// cr --> current row
// cc --> current col	
	public static void Print(int er, int ec, int cr, int cc, String ans) {
		// TODO Auto-generated method stub
		if (cc == ec && cr == er) {
			System.out.println(ans);
			return;
		}
		if (cc > ec || cr > er) {
			return;
		}

		Print(er, ec, cr, cc + 1, ans + "H");
		Print(er, ec, cr + 1, cc, ans + "V");

	}
}
