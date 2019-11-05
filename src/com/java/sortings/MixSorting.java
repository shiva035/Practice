package com.java.sortings;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MixSorting {
	private void compositionAlgorithmDemo(){
        List list = new LinkedList<>();
        list.add("element 2");
        list.add("element 2");
        list.add("element 1");
        list.add("element 3");
     //Returns the number of elements in the specified collection         
      //equal to the specified object.
        System.out.println(Collections.frequency(list, "element 3"));
        List list2 = new LinkedList<>();
        list2.add("element 3");
        //Returns true if the two specified collections have no elements in common. 
        System.out.println(Collections.disjoint(list, list2));
        
        System.out.println(Collections.binarySearch(list, "element 2")); 
}
	
	public void arraySorting(){
		// TODO Auto-generated method stub
		int[] nums = { 1,2,3,4,5,10,8 };
		Arrays.sort(nums);
		for(int i:nums){
			System.out.println(i);
		}
		
		
		 String[] strArray = { "abc", "pqr", "cdf","caf" };
	     Arrays.sort(strArray);
	     for(String i:strArray){
				System.out.println(i);
     		}
	     
	     final String key = "pqr";
	     String[] data = { "abc", "cdf", "pqr" };
	     int index = Arrays.binarySearch(data, key);
	     System.out.println(index);
	}
	
	public static void main(String[] args) {
		MixSorting mx = new MixSorting();
//		mx.arraySorting();
		mx.compositionAlgorithmDemo();
	}

}
