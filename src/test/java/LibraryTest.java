package test.java;

import static org.junit.Assert.*; 

import org.junit.Before;  
import org.junit.Test;
import library.Library;  
import library.Member;  
import library.Fiction;  
import library.Book;

public class LibraryTest { 

	private Library library;  
	private Member member;  
	private Book book; 
	
	@Before  
	public void setUp() {  
	    library = new Library();  
	    member = new Member("John Doe", "456");  
	    book = new Fiction("Eden", "John Berry", "9780451524935");  
	}
	
	@Test  
	public void testRegisterMember() {  
	    library.register_member(member);  
	    assertEquals(1, library.getMembers().size());  
	    assertEquals(member, library.getMembers().get(0)); // Fixed method call
	} 
	
	@Test  
	public void testAddBook() {  
	    library.add_book(book);  
	    assertEquals(1, library.getBooks().size());  
	    assertEquals(book, library.getBooks().get(0));  
	} 
	
	@Test  
	public void testListBooks() {  
	    library.add_book(book); 
	    assertNotNull(library.getBooks());
	    assertFalse(library.getBooks().isEmpty());
	  }
}