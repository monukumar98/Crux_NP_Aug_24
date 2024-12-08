package Lec21;

import java.util.Scanner;

public class Rat_Chases_its_cheese {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char[][] maze = new char[n][m];
		for (int i = 0; i < maze.length; i++) {// n
			String s = sc.next();
			for (int j = 0; j < s.length(); j++) {
				maze[i][j] = s.charAt(j);
			}
		}
		int[][] ans = new int[n][m];
		PrintPath(maze, 0, 0, ans);
		if (ispath == false) {
			System.out.println("NO PATH FOUND");
		}

	}

	static boolean ispath = false;

	public static void PrintPath(char[][] maze, int cr, int cc, int[][] ans) {
		if (cr < 0 || cc < 0 || cr >= maze.length || cc >= maze[0].length || maze[cr][cc] == 'X') {
			return;
		}
		maze[cr][cc] = 'X';
		ans[cr][cc] = 1;
		if (cr == maze.length - 1 && cc == maze[0].length - 1) {
			Display(ans);
			ispath = true;
			return;
		}
		PrintPath(maze, cr - 1, cc, ans);// up
		PrintPath(maze, cr, cc - 1, ans);// left
		PrintPath(maze, cr + 1, cc, ans);// down
		PrintPath(maze, cr, cc + 1, ans);// right
		maze[cr][cc] = 'O';
		ans[cr][cc] = 0;

	}

	public static void Display(int[][] ans) {
		// TODO Auto-generated method stub
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[0].length; j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}

	}

}
