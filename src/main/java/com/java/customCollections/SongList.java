package com.java.customCollections;

import java.util.ArrayList;
import java.util.Collections;

import com.java.utility.MyUtility;

public class SongList {
	
	public static void main(String[] args) {
		
		Song song1 = new Song("kyu hawa ye gun gaa rahi he", 2008, "Lata Mangeshkar");
		Song song2 = new Song("yeh jo desh he mera", 2009, "A R Rehman");
		Song song3 = new Song("zindagi iss kadar", 2004, "Alka Yagnik");
		Song song4 = new Song("dil deewana", 2006, "Sonu Nigam");
		
		ArrayList<Song> songList = new ArrayList<>(); 
		songList.add(song1);
		songList.add(song2);
		songList.add(song3);
		songList.add(song4);
		
		MyUtility.printList(songList);
		
		Collections.sort(songList);
		System.out.println("Sorted songs : ");
		MyUtility.printList(songList);
	}

}
