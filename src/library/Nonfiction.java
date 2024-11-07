package library; 
 
/**
 * This class describes a nonfiction book. 
 * The class extends the Book class and inherits properties and methods.
 * */
public class Nonfiction extends Book { 
	
	/** 
	 * Constructs a new Nonfiction book with the title, author, and ISBN. 
	 * 
	 * @param title The title of the nonfiction book. 
	 * @param author The author of the nonfiction book 
	 * @param ISBN The International Standard Book Number for the fiction book.
	 * 
	 * */
	public Nonfiction(String title, String author, String ISBN ) { 
		super(title, author, ISBN);
	}  
	
	/** Returns a string of the nonfiction book's details. 
	 * 
	 * This method overrides the describe method from the Book class 
	 * and adds a prefix indicating that this is a nonfiction book. 
	 * 
	 * @return A string describing the nonfiction book in the format: 
	 * 		   "Nonfiction: [title] by [author], ISBN:[ISBN]
	 * 
	 * 
	 * */
	
	@Override 
	public String describe() { 
		return "Nonfiction  "  + getTitle() + "by " + getAuthor() + "ISBN: " + getISBN();
	}
}