package com.java.customCollections;

public class Song implements Comparable<Song> {
	private String title;
	private Integer year;
	private String artist;

	public Song(String title, int year, String artist) {
		this.title = title;
		this.year = year;
		this.artist = artist;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	@Override
	public String toString() {
		return "Song [title=" + title + ", year=" + year + ", artist=" + artist + "]";
	}

	@Override
	public int compareTo(Song anotherSong) {
		return this.getYear().compareTo(anotherSong.getYear());
	}

}
