package library; 

/** 
 * 
 *  This class is used to describe each person object.
 *  
 *  */
public abstract class Person { 
	private String name; 
	private String id;  
	
	/** 
	 * Constructs a new Person with name and id
	 * 
	 * @param name The name of the book. 
	 * @param id The id of the person
	 * */
	public Person(String name, String id) { 
		this.name = name; 
		this.id = id; 
		
	} 
	
	/** 
	 * Returns a string of the person's details. 
	 * 
	 * This method provides a description that includes: 
	 * name and id. 
	 * 
	 * @return A string describing the person in the format: 
	 * 		   "Name: " + name + " id: " + id;
	 * 
	 * 
	 * */
	public String describe() { 
		return "Name: " + name + "id " + id ;
	};
}