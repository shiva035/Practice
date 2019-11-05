package com.java.set.demo;

import java.util.HashSet;
import java.util.Set;

class Employee{
	private int id;
	private String Name;
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		Name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	@Override
	public String toString(){
		return "Employee{ " + "id : "+ id + "," + "name : "+ Name + " }"; 
	}
}


public class UserDefinedSetDemo {
	
	public static void main(String[] arg){
		Employee e1 = new Employee(1,"Toy");
		Employee e2 = new Employee(2,"Roy");
		Employee e3 = new Employee(3,"Boy");
		Set<Employee> hashSet = new HashSet<>();
		hashSet.add(e1);
		hashSet.add(e3);
		hashSet.add(e2);
		hashSet.add(e1);
		System.out.println(hashSet);
	}
}
