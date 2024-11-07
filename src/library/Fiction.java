package library; 

/**
 * This class describes a fiction book. 
 * The class extends the Book class and inherits properties and methods.
 * */
public class Fiction extends Book { 
	
	/** 
	 * Constructs a new Fiction book with the title, author, and ISBN. 
	 * 
	 * @param title The title of the fiction book. 
	 * @param author The author of the fiction book 
	 * @param ISBN The International Standard Book Number for the fiction book.
	 * 
	 * */
	public Fiction(String title, String author, String ISBN ) { 
		super(title, author, ISBN);
	}  
	
	/** 
	 * Returns a string of the fiction book's details. 
	 * 
	 * This method overrides the describe method from the Book class 
	 * and adds a prefix indicating that this is a fiction book. 
	 * 
	 * @return A string describing the fiction book in the format: 
	 * 		   "Fiction: [title] by [author], ISBN:[ISBN]
	 * 
	 * 
	 * */
	
	@Override 
	public String describe() { 
		return "Fiction" + getTitle() + "by " + getAuthor() + "ISBN: " + getISBN();
	
	}
}