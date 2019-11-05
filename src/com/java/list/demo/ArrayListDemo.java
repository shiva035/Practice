package com.java.list.demo;
import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> arList = new ArrayList<>();
		arList.add("Qulity");
		arList.add("Info");
		arList.add("Round");
		arList.add("Extra");
		arList.add("Info");
		arList.add("Fixed");
		System.out.println(arList);
		
		System.out.println("IndexOf Search in array list: "+ arList.indexOf("Info"));
		
		for(String str : arList.subList(0, 2)){
			System.out.println(str);	
		}
		
		System.out.println("LastIndexOf Search in array list: "+ arList.lastIndexOf("Info"));
		
		ListIterator<String> lst = arList.listIterator();
		while(lst.hasNext()){
			System.out.println(lst.next());
		}

		while(lst.hasPrevious()){
			System.out.println(lst.previous());
		}	
		
 	}

}
