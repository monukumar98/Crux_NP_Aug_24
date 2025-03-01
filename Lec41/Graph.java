package Lec41;

import java.util.*;

public class Graph {
	private HashMap<Integer, HashMap<Integer, Integer>> map;

	public Graph(int v) {
		// TODO Auto-generated constructor stub
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());
		}
	}

	public void AddEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}

	public boolean ContainsEdge(int v1, int v2) {
		return map.get(v1).containsKey(v2);
	}

	public boolean Containsvertex(int v1) {
		return map.containsKey(v1);
	}

	public int noofEdge() {
		int sum = 0;
		for (int vtx : map.keySet()) {
			sum += map.get(vtx).size();
		}
		return sum / 2;
	}

	public void removeEdge(int v1, int v2) {
		map.get(v1).remove(v2);
		map.get(v2).remove(v1);
	}

	public void removevertex(int v1) {
		for (int nbrs : map.get(v1).keySet()) {
			map.get(nbrs).remove(v1);
		}
		map.remove(v1);

	}

	public void Display() {
		for (int vtx : map.keySet()) {
			System.out.println(vtx + " " + map.get(vtx));
		}
	}

	public boolean HasPath(int src, int Des, HashSet<Integer> visited) {
		if (src == Des) {
			return true;
		}
		visited.add(src);
		for (int nbrs : map.get(src).keySet()) {
			if (!visited.contains(nbrs)) {
				boolean ans = HasPath(nbrs, Des, visited);
				if (ans == true) {
					return ans;
				}
			}
		}
		return false;

	}

	public void PrintPath(int src, int Des, HashSet<Integer> visited, String str) {
		if (src == Des) {
			System.out.println(str + Des);
			return;
		}
		visited.add(src);
		for (int nbrs : map.get(src).keySet()) {
			if (!visited.contains(nbrs)) {
				PrintPath(nbrs, Des, visited, str + src);

			}
		}
		visited.remove(src);
	}

	public boolean BFS(int src, int des) {
		Queue<Integer> q = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		q.add(src);
		while (!q.isEmpty()) {
			// 1. remove
			int rv = q.poll();
			// 2. Ignore if Already Visited
			if (visited.contains(rv)) {
				continue;
			}
			// 3. Marked Visited
			visited.add(rv);
			// 4. self work
			if (rv == des) {
				return true;
			}
			// 5. add unvisited nbrs
			for (int nbrs : map.get(rv).keySet()) {
				if (!visited.contains(nbrs)) {
					q.add(nbrs);
				}
			}

		}
		return false;
	}

	public boolean DFS(int src, int des) {
		Stack<Integer> st = new Stack<>();
		HashSet<Integer> visited = new HashSet<>();
		st.push(src);
		while (!st.isEmpty()) {
			// 1. remove
			int rv = st.pop();
			// 2. Ignore if Already Visited
			if (visited.contains(rv)) {
				continue;
			}
			// 3. Marked Visited
			visited.add(rv);
			// 4. self work
			if (rv == des) {
				return true;
			}
			// 5. add unvisited nbrs
			for (int nbrs : map.get(rv).keySet()) {
				if (!visited.contains(nbrs)) {
					st.push(nbrs);
				}
			}

		}
		return false;
	}

	public void BFT() {
		Queue<Integer> q = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		for (int src : map.keySet()) {
			if (visited.contains(src)) {
				continue;
			}
			q.add(src);
			while (!q.isEmpty()) {
				// 1. remove
				int rv = q.poll();
				// 2. Ignore if Already Visited
				if (visited.contains(rv)) {
					continue;
				}
				// 3. Marked Visited
				visited.add(rv);
				// 4. self work
				System.out.print(rv + " ");
				// 5. add unvisited nbrs
				for (int nbrs : map.get(rv).keySet()) {
					if (!visited.contains(nbrs)) {
						q.add(nbrs);
					}
				}

			}
		}
		System.out.println();
	}

	public void DFT() {
		Stack<Integer> st = new Stack<>();
		HashSet<Integer> visited = new HashSet<>();
		for (int src : map.keySet()) {
			if (visited.contains(src)) {
				continue;
			}
			st.push(src);
			while (!st.isEmpty()) {
				// 1. remove
				int rv = st.pop();
				// 2. Ignore if Already Visited
				if (visited.contains(rv)) {
					continue;
				}
				// 3. Marked Visited
				visited.add(rv);
				// 4. self work
				System.out.print(rv + " ");
				// 5. add unvisited nbrs
				for (int nbrs : map.get(rv).keySet()) {
					if (!visited.contains(nbrs)) {
						st.push(nbrs);
					}
				}

			}
		}
		System.out.println();
	}

}
