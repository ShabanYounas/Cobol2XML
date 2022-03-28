package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import parse.tokens.Token;

public class WhenAssemblerTest {

	@Test
	public void test() {
		String x, y, ab = "when ";
		char w= ' ';
		int i = 0;
		Token t = new Token(ab);
//		assertTrue(t.isNumber());
//		assertFalse(t.isNumber());
		assertTrue(t.isWord());
//		assertFalse(t.isWord());
//		assertFalse(t.isSymbol());
//		assertTrue(t.isSymbol());
	}

}
