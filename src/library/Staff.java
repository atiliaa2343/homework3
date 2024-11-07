package library; 
/**
 * This class describes a staff member of the library . 
 * The class extends the Person class and inherits properties and methods.
 * */
public class Staff extends Person {  
	
	/** 
	 * Constructs a new Staff member with the name and 
	 * id. 
	 * 
	 * @param name  The name of the staff member. 
	 * @param id 	The id of the staff member.
	 * 
	 * */
	public Staff(String name, String id ) { 
		super(name, id);
	}  
	
	
	/** 
	 * Returns a string representation of the staff member's details. 
	 * 
	 * This method overrides the describe method from the Person class 
	 * and adds a prefix indicating that this is a staff member. 
	 * 
	 * @return A string describing the staff member in the format: 
	 * 		   "Staff: [name] id: [id]"
	 * 
	 * */
	@Override 
	public String describe() { 
		return "Staff" + super.describe();
	
	} 
	
	/** 
	 * Registers a new member to the library system 
	 *
	 * This method adds the member object to the list of members. 
	 * 
	 * @param library The Library object where the member will be registered. 
	 * 
	 * @param member The member object to be added to the library.
	 * 
	 * */
	
	public void register_member(Library library, Member member) { 
		library.register_member(member);
	} 
	
	/** 
	 * Registers a new book to the library system 
	 *
	 * This method adds the Book object to the collection of books. 
	 * 
	 * @param library The Library object where the book will be registered. 
	 * 
	 * @param member The Book object to be added to the library.
	 * 
	 * */ 
	public void register_book(Library library, Book book) { 
		library.add_book(book);
	}
}