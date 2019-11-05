package com.java.map.demo;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class HashMapDemo {
	
	public void threadSafeMethord(){
		Map<Integer,String> hashMap = new HashMap<>();
		hashMap.put(1,"One");
		hashMap.put(2,"Two");
		hashMap.put(3,"Three");
		Map<Integer,String>  synchronizedMap = Collections.synchronizedMap(hashMap);
		
		synchronized (synchronizedMap) {
			synchronizedMap.forEach((k,v) ->{
				System.out.println(k);
				System.out.println(v);
			});	
		}

	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> hashMap = new HashMap<>();
		hashMap.put(1,"One");
		hashMap.put(2,"Two");
		hashMap.put(3,"Three");
		hashMap.put(4,"Four");
		hashMap.put(5,"Five");
		hashMap.putIfAbsent(5, "duplicate");
		System.out.println(hashMap);
		System.out.println(hashMap.keySet());
		System.out.println(hashMap.values());
//		for(Integer s : hashMap.keySet()){
//			System.out.println(s);
//		}
//		
//		for(Entry<Integer, String> s : hashMap.entrySet()){
//			System.out.println(s.getKey());
//			System.out.println(s.getValue());
//		}
//		
//		for(String s : hashMap.values()){
//			System.out.println(s);
//		}
		
//		hashMap.forEach((k,v)->{
//			System.out.println(k);
//			System.out.println(v);
//		});
		
		HashMapDemo h = new HashMapDemo();
		h.threadSafeMethord();
	}

}
