package test.java;

import static org.junit.Assert.*; 
import org.junit.Before; 
import org.junit.Test;
import library.Book;
import library.Library;
import library.Member;
import library.Staff;
import library.Fiction;

public class IntegrationTest { 

	private Library library; 
	private Staff staff; 
	private Member member; 
	private Book book; 
	
	@Before 
	public void setUp() {
		library = new Library(); 
		staff = new Staff("Bobby", "001"); 
		member = new Member("Tilly", "156"); 
		book = new Fiction("Halle Berry", "Thomas Hill", "9780060850524"); 	
	
		   // Debugging output
	    System.out.println(library); // Should not be null
	    System.out.println(staff); // Should not be null
	    System.out.println(member); // Should not be null
	    System.out.println(book); // Should not be null
	
	} 	  
	@Test 
	public void testRegisterMemberAndCheckOutBook() { 
		
	    
	    staff.register_member(library, member);  
	    staff.register_book(library, book); 
		
	    	    assertEquals(1, library.getMembers().size()); // Check if one member is registered
	    assertEquals(member, library.getMembers().get(0)); // Check if registered member is correct
	    assertEquals(1, library.getBooks().size()); // Check if one book is added
	    assertEquals(book, library.getBooks().get(0)); // Check if added book is correct
		
	 
	    assertTrue(book.check_out()); 
		
	    
	    assertTrue(book.isCheckedOut());
	}
}