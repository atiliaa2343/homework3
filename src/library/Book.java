package library;

/** 
 * 
 *  This class is able to check out and return books.
 *  It also states the information that each book is required
 *  to have which is the title, author, ISBN, and whether it 
 *  is checked out.
 *  
 *  */
public abstract class Book { 
	private String title; 
	private String author; 
	private String ISBN; 
	private boolean is_checked_out;  
	
	/**
	 * Constructs a new Book with the specified title, author, and ISBN.
	 * 
	 * @param title The title of the book.
	 * @param author The author of the book.
	 * @param ISBN The International Standard Book Number for the book.
	 */
	public Book(String title, String author, String ISBN) { 
		this.title = title; 
		this.author = author; 
		this.ISBN = ISBN; 
		this.is_checked_out = false;
	}
	
	/**
	 * This method checks whether a book has been checked out. 
	 * 
	 * It uses if statements to check whether it has been checked out, 
	 * if a book has not been checked out it will changed the is_checked_out 
	 * variable to true, and it will return true. 
	 * 
	 * If the variable has been checked out it will return false.
	 * */
	public boolean check_out() { 
		if(!is_checked_out) { 
			is_checked_out = true; 
			System.out.println("Book checked out successfully");
			return true;
		} else { 
			System.out.println("Book is already checked out.");
			return false;
		}
	}  
	
	/** 
	 * This method returns a book into the library system. 
	 * 
	 * It first checks wether the book has been checked out, if the 
	 * book has been checked out, the variable will then be changed to false. 
	 * The return value will be true. 
	 * 
	 * If the book has not been checked out, it will return false.
	 * */
	
	public boolean return_book() { 
		if(is_checked_out) { 
			is_checked_out = false; 
			System.out.println("Book has been returned"); 
			return true;
			
			
		} else { 
			System.out.println("Book was never checked out.");
			return false;
		}
	} 
	
	/** 
	 * Returns a string of the book's details. 
	 * 
	 * This method provides a description that includes: 
	 * title, author, and ISBN. 
	 * 
	 * @return A string describing the book in the format: 
	 * 		   "Book: " + title + " by " + author + ", ISBN: " + ISBN;
	 * 
	 * 
	 * */
	public abstract String describe() ; 
	
	/**
     * Gets the title of the book.
     * 
     * @return The title of the book.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Gets the author of the book.
     * 
     * @return The author of the book.
     */
    public String getAuthor() {
        return author;
    } 
    
    /**
     * Gets the ISBN of the book.
     * 
     * @return The ISBN of the book.
     */
    public String getISBN() {
        return ISBN;
    }

    /**
     * Checks if the book is currently checked out.
     * 
     * @return true if the book is checked out, false otherwise.
     */
    public boolean isCheckedOut() {
        return is_checked_out;
    }
	
	
	
}