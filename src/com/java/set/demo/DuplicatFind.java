package com.java.set.demo;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class DuplicatFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String message = "If the message was passed along successfully the first time, the second attempt will produce a second copy of the same message, and you will likely receive both copies. On large networks such as the internet, a mail message must usually pass through several different";
		String[] messageArray = message.split(" ");
		Set<String> linkedhs = new LinkedHashSet<>();
		
		List<String> duplicate = new LinkedList<>();
		for(int i = 0; i < messageArray.length; i++){
			if(linkedhs.contains(messageArray[i])){
				duplicate.add(messageArray[i]);
			}else linkedhs.add(messageArray[i]);
		}
		
		System.out.println("Number of strings " + messageArray.length + " not duplicat are " + linkedhs.size()   );
		System.out.println(linkedhs);
		System.out.println(duplicate);
	}

}
