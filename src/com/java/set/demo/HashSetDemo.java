package com.java.set.demo;
import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> hs = new HashSet<>();
		hs.add("kaam");
		hs.add("naam");
		hs.add("dhaam");
		
		Set<String> bs = new HashSet<>();
		bs.add("kaam");
		bs.add("naam");
		bs.add("dhaam");
		
		Set<String> ts = new HashSet<>();
		
		System.out.println("print HashSet : " + hs);
		System.out.println("print HashSet Size : " + hs.size());
		System.out.println(hs.toString());
		System.out.println(hs.contains("kaam"));
		System.out.println(hs.containsAll(bs));
		//hash code of two set with same content alway be same
		System.out.println(hs.hashCode());
		System.out.println(bs.hashCode());
		//test is empty 
		System.out.println(bs.isEmpty());
		System.out.println(ts.isEmpty());
		hs.forEach(i->{
			System.out.println(i);
		});
		

	}

}
