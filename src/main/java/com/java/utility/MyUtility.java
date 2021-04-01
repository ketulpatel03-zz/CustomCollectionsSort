package com.java.utility;

import java.util.ArrayList;

public class MyUtility {

	public static <T> void printList(ArrayList<T> list) {
		for (T i : list) {
			System.out.println(i);
		}
	}

}
