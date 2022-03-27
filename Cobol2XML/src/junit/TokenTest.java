package junit;

import static org.junit.Assert.*;

import org.junit.Test;
import parse.tokens.Token;

public class TokenTest {

	@Test
	public void test() {
			String c = "15.5";
		Token t1 = new Token(c);
//		assertTrue(t1.isNumber());
	assertTrue(t1.isWord());
//		assertTrue(t1.isSymbol());
	
//		checks if the programs functionaluty is functionoint proerly. 
//		for example char c = "1"
//		if we tryied to tokenise char it will not work becuase its a string not a char because of th"" instead we need to use ''.a 
//		
//		
//		int d = 5;
//		Token t2 = new Token(d);
//		assertTrue(t2.isNumber());
//		assertFalse(t2.isWord());
//		assertFalse(t2.isSymbol());
//	
//		String e = "Kamil";
//		Token t3 = new Token(e);
//		assertFalse(t3.isNumber());
//		assertTrue(t3.isWord());
//		assertFalse(t3.isSymbol());
//	
//		Float f = 5.2f ;
//		Token t4 = new Token(f);
//		assertTrue(t4.isNumber());
//		assertFalse(t4.isWord());
//		assertFalse(t4.isSymbol());
//	

	}

}
