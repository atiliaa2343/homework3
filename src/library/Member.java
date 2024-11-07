package library; 

/**
 * This class describes a member of the library . 
 * The class extends the Person class and inherits properties and methods.
 * */
public class Member extends Person {  
	
	/** 
	 * Constructs a new Member with name and id. 
	 * 
	 * @param name The name of the person. 
	 * @param id The id of the person.
	 * 
	 * */
	public Member(String name, String id) { 
		super(name, id);
	}  
	
	/** 
	 * Returns a string of the member's name 
	 * 
	 * This method overrides the describe method from the Person class 
	 * and adds a prefix that indicates this is a member. 
	 * 
	 * @return A string describing the member in the format: 
	 * 		   "Member: [name] id: [id]
	 * 
	 * 
	 * */
	
	@Override 
	public String describe() { 
		return "Member" + super.describe();
	
	}
}
