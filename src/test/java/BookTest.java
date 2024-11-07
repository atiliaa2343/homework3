package test.java;

import static org.junit.Assert.*; 
import org.junit.Before; 
import org.junit.Test;
import library.Fiction; 

public class BookTest { 
	private Fiction fictionBook; 
	
	@Before 
	public void setUp() { 
		fictionBook = new Fiction("Prestige Hearts", "R.F. Whong", "9780743273565"); 
	}
		
	@Test 
	public void testCheckOut() { 
		assertTrue(fictionBook.check_out()); 
		assertTrue(fictionBook.isCheckedOut()); 
	} 
	
	@Test  
	public void testReturnBook() { 
		fictionBook.check_out(); 
		assertTrue(fictionBook.return_book()); 
		assertFalse(fictionBook.isCheckedOut()); 
	}  
	
	@Test 
	public void testDescribe() { 
		String expectedDescription = "Fiction: Prestige Hearts by R.F. Whong, ISBN: 9780743273565"; 
		assertEquals(expectedDescription, fictionBook.describe()); 
	}
}

	
