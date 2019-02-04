package com.movies;

public class Movie {
	
	private String title;
	private int year;
	private double runTime;
	
	public Movie() {
		super();
	}

	public Movie(String title, int year, double runTime) {
		super();
		this.title = title;
		this.year = year;
		this.runTime = runTime;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getRunTime() {
		return runTime;
	}

	public void setRunTime(double runTime) {
		this.runTime = runTime;
	}
	
	
	

}
