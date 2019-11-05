package com.java.map.demo;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


class Employee{
	private int id;
	private String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> ls = new LinkedList<>();
		ls.add(new Employee(1, "john"));
		ls.add(new Employee(2, "shrivan"));
		ls.add(new Employee(3, "Pormaya"));
		Map<String,List> linkmap = new LinkedHashMap<>();
		linkmap.put("Employee",ls);
		
		for(Entry<String, List> edata: linkmap.entrySet() ){
			System.out.println("Key : "+ edata.getKey());
			List<Employee> mapls =  edata.getValue();
			for(Employee e : mapls){
				System.out.println("Employee Id "+ e.getId() + " and Name "+ e.getName());
			}
		}
		
	}

}
