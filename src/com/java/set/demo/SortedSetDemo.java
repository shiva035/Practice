package com.java.set.demo;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedSet<String> sortedSet = new TreeSet<>();
		sortedSet.add("test3");
		sortedSet.add("test2");
		sortedSet.add("test1");
		sortedSet.add("test4");
		
		System.out.println(sortedSet);
		System.out.println("First : "+ sortedSet.first());
		System.out.println("Last : "+ sortedSet.last());
		System.out.println("subSet : "+ sortedSet.subSet(sortedSet.first(), sortedSet.last()));
		System.out.println("headSet : "+ sortedSet.headSet("test4"));
		System.out.println("tailSet : "+ sortedSet.tailSet("test4"));
	}

}
