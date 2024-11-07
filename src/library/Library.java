package library;
import java.util.*; 

/** 
 *  This class represents the library.
 *  Contains methods that are able to add books and members. 
 *  This class is also able to list all books,members, and staff.
 *  
 *  */

public class Library {  
	private List<Book> books; 
	private List<Member> members; 
	private List<Staff> staff;  
	
	/** 
	 * Creates an array list to store the list of  books, 
	 * members, and staff.
	 * */
	
	public Library() { 
		books = new ArrayList<>(); 
		members = new ArrayList<>(); 
		staff = new ArrayList<>();
	}
	
	
	/** 
	 * Adds a book to the array list books
	 * 
	 * It takes a book object as a parameter and adds it to the 
	 * list of books. 
	 * 
	 * @param book The Book object to be added to the library.
	 * */
	public void add_book(Book book) { 
		books.add(book);
	} 
	
	/** 
	 * Adds a member to the array list members
	 * 
	 * It takes a member object as a parameter and adds it to the 
	 * list of members. 
	 * 
	 * @param member The Member object to be added to the library.
	 * */
	public void register_member(Member member) { 
		members.add(member);
	} 
	
	/**
	 * Prints out every object in the array list books 
	 * 
	 * This method uses a for loop to print out each book
	 * object in the array list.
	 * 
	 * */ 
	public void list_books() { 
		System.out.println("List of Books:"); 
		for (Book book: books) { 
			System.out.println(book.describe());
		}
	}  
	
	/** 
	 * Prints out every object in the array list members 
	 * 
	 * This method uses a for loop to print out each member
	 * object in the array list.
	 * 
	 * */ 
		public void list_members() { 
			System.out.println("List of Members:"); 
			for (Member member: members) { 
				System.out.println(member.describe());
			}
		}  
		
		
	/** 
	 * Prints out every object in the array list staff 
	 * 
	 * This method uses a for loop to print out each staff
	 * object in the array list.
	 * 
	 * */  
		public void list_staff() { 
			System.out.println("List of Staff:"); 
			for (Staff staffmember: staff) { 
				System.out.println(staffmember.describe());
			}
		}  
		
	/** 
	 * These are getter methods used to test out the functions to see if it retrieves a list for members and books.
	 * */
	    public List<Member> getMembers() {
	        return members;
	    }

	    public List<Book> getBooks() {
	        return books;
	    }
	
	
}