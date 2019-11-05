package com.java.sortings;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;


class Employee implements Comparable<Employee>{
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
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.id - o.getId();
	}
	
}

class SortByName implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}

public class ComparatorOrComparableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(1,"One");
		Employee e2 = new Employee(2,"Two");
		Employee e3 = new Employee(3,"Three");
		Employee e4 = new Employee(4,"Foure");
		List<Employee> eList = new LinkedList<>();
		eList.add(e1);
		eList.add(e3);
		eList.add(e2);
		eList.add(e4);
		System.out.println("Sorting By ID");
		Collections.sort(eList);
		eList.forEach(ls->{
			System.out.println("Employee id "+ ls.getId() + " and Name "+ ls.getName());
		});
		
		System.out.println("Sorting By Name");
		
		Collections.sort(eList,new SortByName());
		eList.forEach(ls->{
			System.out.println("Employee id "+ ls.getId() + " and Name "+ ls.getName());
		});
	}

}
