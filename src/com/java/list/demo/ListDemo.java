package com.java.list.demo;

import java.util.List;
import java.util.LinkedList;;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Double> stock = new LinkedList<>();
		stock.add(220.65);
		stock.add(266.65);
		stock.add(255.65);
		stock.add(263.65);
		
		System.out.println(stock);
		System.out.println(stock.indexOf(255.65));
	}

}
