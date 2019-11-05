package com.java.set.demo;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> tree1 = new TreeSet<>();
		tree1.add("kaam");
		tree1.add("Naam");
		tree1.add("Dhaam");
		
		Set<String> tree2 = new TreeSet<>();
		tree2.add("kaam");
		tree2.add("Naam");
		tree2.add("Dhaam");

		
		System.out.println("Order of TreeSet1 : " + tree1);
		System.out.println("Order of TreeSet2 : " + tree2);
		System.out.println("HashCode Of tree1 " + tree1.hashCode() );
		System.out.println("HashCode Of tree2 " + tree2.hashCode() );

		
		
		Set<Integer> treeNumber = new TreeSet<>();
		treeNumber.add(1);
		treeNumber.add(2);
		treeNumber.add(3);
		treeNumber.add(5);
		treeNumber.add(4);
		treeNumber.forEach(n->{
			System.out.println(n);
		});
		
		tree1.removeAll(tree1);
		System.out.println(tree1);
	}

}
