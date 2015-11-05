package org.totalbeginner.tutorial;

public class Book {

	private String title;
	private String author;
	private Person person;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Book(String nameOfBook) {
		// TODO Auto-generated constructor stub
		author = "unknown author";
		title = nameOfBook;
	}

	public Person getPerson() {
		return this.person;
	}

	public void setPerson(Person p2) {
		this.person = p2;		
	}
	
	public String toString() {
		String available;
		if(this.getPerson() == null)
		{
			available = "Available";
		}
		else{
			available = "Checked out to " +
		this.getPerson().getName();
		
		}
		return this.getTitle() + " by " + this.getAuthor() + "; " + available;
	}
	

}
