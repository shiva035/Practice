package com.java.sortings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MultiSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> person = new ArrayList<Person>();
		Person e1 = new Person(1, "aTestName", "rLastName", 34);
		Person e2 = new Person(2, "xTestName", "pLastName", 30);
		Person e3 = new Person(3, "kTestName", "sLastName", 31);
		Person e4 = new Person(4, "dTestName", "oLastName", 25);
		Person e5 = new Person(2, "caestName", "lLastName", 30);
		person.add(e1);
		person.add(e2);
		person.add(e3);
		person.add(e4);
		person.add(e5);
		Collections.sort(person, Comparator.comparingInt(Person::getAge).thenComparing(Person::getFirstName));
		
		person.forEach(p->{
			System.out.println("Age : "+ p.getAge() + " " +"Name : "+ p.getFirstName());
		});
		
		Comparator<Person> comparator = Comparator.comparing(p -> p.getFirstName());
		person.sort(comparator);
		person.forEach(p->{
			System.out.println(p.getFirstName());
		});
		
		Comparator<Person> lastname = Comparator.comparing(p -> p.getLastName());
		person.sort(lastname);
		person.forEach(p->{
			System.out.println(p.getLastName());
		});
//		System.out.println(person);
	}

}

class Person{
	private int id = -1;
    private String firstName = null;
    private String lastName = null;
    private int age = -1;
    
	public Person(int id, String firstName, String lastName, int age) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
    
}