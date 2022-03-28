package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import parse.tokens.Token;

public class SearchAssmblerTest {

	@Test
	public void test() {
		String x = "search ";
		char w= ' ';
		int i = 0;
		Token t = new Token(x);
//	    assertTrue(t.isNumber());
//		assertFalse(t.isNumber());
		assertTrue(t.isWord());
//		assertFalse(t.isWord());
//		assertFalse(t.isSymbol());
//		assertTrue(t.isSymbol());
	}

}
