package com.java.set.demo;

import java.util.*;

public class IteratorSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> hashSet = new HashSet<>();
		hashSet.add("FTIL");
		hashSet.add("Mphasis");
		hashSet.add("Citius");
		System.out.println("Using Foreach");
		hashSet.forEach(data->{
			System.out.println(data);
		});
		System.out.println("Using Advance For");
		for(String data : hashSet){
			System.out.println(data);
		}
		
		Iterator<String> itr = hashSet.iterator();
		System.out.println("Old Iterator with while ");
		while(itr.hasNext()){
			String str = itr.next();
			System.out.println(str);
		}
		Iterator<String> itr1 = hashSet.iterator();
		System.out.println("Iterator forEachRemaining ");
		itr1.forEachRemaining(data->{
			System.out.println(data);
		});

	}

}
