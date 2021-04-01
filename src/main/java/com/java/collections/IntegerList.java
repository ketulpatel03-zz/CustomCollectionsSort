package com.java.collections;

import java.util.ArrayList;
import java.util.Collections;

import com.java.utility.MyUtility;

public class IntegerList {
	public static void main(String[] args) {
		ArrayList<Integer> integerList = new ArrayList<>();
		integerList.add(10);
		integerList.add(5);
		integerList.add(7);
		integerList.add(9);
		integerList.add(3);

		MyUtility.printList(integerList);

		Collections.sort(integerList);

		System.out.println("Sorted List : ");
		MyUtility.printList(integerList);
	}

}
