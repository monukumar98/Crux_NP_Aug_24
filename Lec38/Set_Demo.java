package Lec38;

import java.util.*;

public class Set_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set = new HashSet<>();
		set.add(2);
		set.add(21);
		set.add(3);
		set.add(-2);
		set.add(11);
		set.add(1);
		set.add(98);
		set.add(1);
		System.out.println(set);
		// contains
//		System.out.println(set.contains(109));
//		System.out.println(set.contains(1));
//		System.out.println(set.size());
//		for (int v : set) {
//			System.out.print(v + " ");
//		}
//		System.out.println();
		TreeSet<Integer> set1 = new TreeSet<>();
		set1.add(2);
		set1.add(21);
		set1.add(3);
		set1.add(-2);
		set1.add(11);
		set1.add(1);
		set1.add(98);
		set1.add(1);
		System.out.println(set1);
		LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
		set2.add(2);
		set2.add(21);
		set2.add(3);
		set2.add(-2);
		set2.add(11);
		set2.add(1);
		set2.add(98);
		set2.add(1);
		System.out.println(set2);
		System.out.println(set.remove(110));
		System.out.println(set.remove(1));

	}

}









