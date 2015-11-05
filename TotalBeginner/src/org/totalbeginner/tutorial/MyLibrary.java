package org.totalbeginner.tutorial;

import java.util.*;;

public class MyLibrary {

	private String name;
	private ArrayList<Book> books;
	private ArrayList<Person> people;

	public MyLibrary(String name) {
		this.setName(name);
		books = new ArrayList<Book>();
		people = new ArrayList<Person>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Book> getBooks() {
		return books;
	}

	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}

	public ArrayList<Person> getPeople() {
		return people;
	}

	public void setPeople(ArrayList<Person> people) {
		this.people = people;
	}

	public void addBook(Book b1) {
		// TODO Auto-generated method stub
		this.books.add(b1);
	}

	public void removeBook(Book b1) {
		// TODO Auto-generated method stub
		this.books.remove(b1);
		
	}
	public void addPerson(Person x)
	{
		this.people.add(x);
	}
	
	public void removePerson(Person x)
	{
		this.people.remove(x);
	}

	public boolean checkOut(Book b1, Person p1) {
		int booksOut = this.getBooksForPerson(p1).size();
		if((b1.getPerson() == null) && 
				(booksOut < p1.getMaximumBooks())){
			b1.setPerson(p1);
			return true;
		}
		return false;
	}

	public boolean checkIn(Book b1) {

		if(b1.getPerson() != null)
		{
			b1.setPerson(null);
			return true;
		}
		return false;
	}

	public ArrayList<Book> getBooksForPerson(Person p1) {
		ArrayList<Book> result = new ArrayList<Book>();
		for(Book aBook : this.getBooks())
		{
			if((aBook.getPerson() != null) && (aBook.getPerson().getName().equals(p1.getName()))){
				result.add(aBook);
			}
		}
		return result;
	}

	public ArrayList<Book> getAvailableBooks() {
		ArrayList<Book> result = new ArrayList<Book>();
		for(Book aBook : this.getBooks()){
			if(aBook.getPerson() == null){
				result.add(aBook);
			}
		}
		return result;
	}

	public ArrayList<Book> getUnavailableBooks() {
		ArrayList<Book> result = new ArrayList<Book>();
		for(Book aBook : this.getBooks()){
			if(aBook.getPerson() != null){
				result.add(aBook);
			}
		}
		return result;
	}
	
	public String toString() {
		return this.getName() + ": " + this.getBooks().size() + " books; " + 
	this.getPeople().size() + " people.";
	}
	
	public static void main(String[] args) {
		//create a new MyLibrary
		MyLibrary testLibrary = new MyLibrary("Test Drive Library");
		
		Book b1 = new Book("War and Peace");
		Book b2 = new Book("Great Expectatons");
		
		b1.setAuthor("Tolstoy");
		b2.setAuthor("Dickens");
		Person jim = new Person();
		Person sue = new Person();
		
		jim.setName("Jim");
		sue.setName("Sue");
		
		testLibrary.addBook(b1);
		testLibrary.addBook(b2);
		testLibrary.addPerson(jim);
		testLibrary.addPerson(sue);
		
		
		//ctrl + space + up arrow
		System.out.println("Just created new library");
		testLibrary.printStatus();
		
		System.out.println("Check out War and Peace to Sue");
		testLibrary.checkOut(b1, sue);
		testLibrary.printStatus();
		
		System.out.println("Do some more stuff");
		testLibrary.checkIn(b1);
		testLibrary.checkOut(b2, jim);
		testLibrary.printStatus();
		
		
	}

	private void printStatus() {
		// TODO Auto-generated method stub
		System.out.println("Status Report of MyLibrary \n" + this.toString());
		for(Book thisBook : this.getBooks()){
			System.out.println(thisBook);
		}
		for(Person p : this.getPeople()){
			int count = this.getBooksForPerson(p).size();
			System.out.println(p + "has " + count + " of my books");
		}
		System.out.println("Books Available: " + this.getAvailableBooks().size());
		
		System.out.println("---End of Status Report ---");
		
	}

}
