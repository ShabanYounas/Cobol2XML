package junit;

import static org.junit.Assert.*;

import org.junit.Test;
import parse.tokens.Token;

public class TokenTest {

	@Test
	public void test() {
			char c = '1';
		Token t1 = new Token(c);
		assertFalse(t1.isNumber());
		assertFalse(t1.isWord());
		assertTrue(t1.isSymbol());
	
		int d = 5;
		Token t2 = new Token(d);
		assertTrue(t2.isNumber());
		assertFalse(t2.isWord());
		assertFalse(t2.isSymbol());
	
		String e = "Kamil";
		Token t3 = new Token(e);
		assertFalse(t3.isNumber());
		assertTrue(t3.isWord());
		assertFalse(t3.isSymbol());
	
		Float f = 5.2f ;
		Token t4 = new Token(f);
		assertTrue(t4.isNumber());
		assertFalse(t4.isWord());
		assertFalse(t4.isSymbol());
	

	}

}
