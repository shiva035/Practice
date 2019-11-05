package com.java.set.demo;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.*;

public class MixDemo {
	// Set bulk operations
	private static void bulkOperationDemo() {
	 Set<String> set = new HashSet<>();
	 set.add("element1");
	 set.add("element2");
	 set.add("element3");
	 set.add("element4");

	 // Appends all of the elements in the specified collection to the end of
	 // this list,
	 // in the order that they are returned by the specified collection's
	 // iterator (optional operation).
	 Set<String> union = new HashSet<String>();
	 union.addAll(set);
	 printMessage(union, "addALL operation example ");

	 // Retains only the elements in this list that are contained in
	 // the specified collection (optional operation).
	 Set<String> intersection = new HashSet<String>();
	 intersection.add("element 1");
	 intersection.add("element 2");
	 intersection.add("element 3");
	 intersection.add("element 4");
	 System.out.println("retainAll -- > " + intersection.retainAll(set));

	 // Removes from this list all of its elements that are
	 // contained in the specified collection (optional operation).
	 Set<String> difference = new HashSet<String>();
	 difference.add("element 1");
	 difference.add("element 2");
	 difference.add("element 3");
	 difference.add("element 4");
	 System.out.println("removeAll operation example ---> " + difference.removeAll(set));
	 printMessage(difference, "removeAll operation example ");

	 Set<String> checking = new HashSet<String>();
	 checking.add("element 1");
	 checking.add("element 2");
	 checking.add("element 3");
	 checking.add("element 4");
	 System.out.println("containsAll operation example ---- > " + checking.containsAll(set));
	}

	private static void printMessage(Set<String> difference, String msg) {
	 difference.forEach(key -> System.out.println(msg + key));
	}
	
	public void perfectSquare(){
		
		Set<Integer> numbers = new LinkedHashSet<>();
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		numbers.add(9);
		numbers.add(10);
		List<Integer> perfectSquares = new ArrayList<>();
		perfectSquares.add(4);
		perfectSquares.add(9);

		numbers.removeAll(perfectSquares);
		System.out.println("After removeAll(perfectSquares) => " + numbers);
		numbers.removeIf(num -> num%2 != 0);
		System.out.println("After removeIf() => " + numbers);
	}

	public static void main(String[] args) {
		MixDemo mx = new MixDemo();
		mx.bulkOperationDemo();
	}

}
