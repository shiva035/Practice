package com.java.map.demo;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> treeMap1 = new TreeMap<>();
		treeMap1.put("key1", "value1");
		treeMap1.put("key3", "value3");
		treeMap1.put("key2", "value2");
		treeMap1.put("key0", "value0");
		System.out.println(treeMap1);
	      
		Map<String,String> treeMap2 = new TreeMap<>(Comparator.reverseOrder());
		treeMap2.put("key1", "value1");
		treeMap2.put("key3", "value3");
		treeMap2.put("key2", "value2");
		treeMap2.put("key0", "value0");
		System.out.println(treeMap2);
	      
	}

}
