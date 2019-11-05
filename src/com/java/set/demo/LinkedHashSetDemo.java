package com.java.set.demo;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> linkedHash1 = new LinkedHashSet<>();
		linkedHash1.add("Kaam");
		linkedHash1.add("Naam");
		linkedHash1.add("Dhaam");
		System.out.println("Order of linkedHashSet : "+ linkedHash1);
		linkedHash1.forEach(link->{
			System.out.println(link);
		});
	}

}
