package com.java.collections;

import java.util.ArrayList;
import java.util.Collections;

import com.java.utility.MyUtility;

public class StringList {
	public static void main(String[] args) {
		ArrayList<String> stringList = new ArrayList<>();
		stringList.add("banana");
		stringList.add("watermelon");
		stringList.add("grapes");
		stringList.add("apple");
		stringList.add("chickoo");

		MyUtility.printList(stringList);

		Collections.sort(stringList);

		System.out.println("Sorted List : ");
		MyUtility.printList(stringList);
	}

}
