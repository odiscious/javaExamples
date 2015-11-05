package org.totalbeginner.tutorial;

public class Person {
	//fields
	private String name; //name of the person
	private int maximumBooks; //most books a person can checkout
	
	//constructors
	public Person(){
		name = "unknown name";
		maximumBooks = 3;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String anyName) {
		name = anyName;
	}

	public int getMaximumBooks() {
		return maximumBooks;
	}

	public void setMaximumBooks(int maximumBooks) {
		this.maximumBooks = maximumBooks;
	}
	
	//use getters and setters for extensible development
	public String toString(){
		return this.getName() + " (" + 
	this.getMaximumBooks() + " books)";
	}
}
