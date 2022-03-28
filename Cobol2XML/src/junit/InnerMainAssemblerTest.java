package junit;

import static org.junit.Assert.*;


import org.junit.Test;

import parse.tokens.Token;

public class InnerMainAssemblerTest {

	@Test
	public void test() {
		String x = "inner main test ";
		char w= 'z';
		int i = 1;
		Token t = new Token(x);
//		assertTrue(t.isNumber());
//		assertFalse(t.isNumber());
		assertTrue(t.isWord());
//		assertFalse(t.isWord());
//		assertFalse(t.isSymbol());
//		assertTrue(t.isSymbol());
	}

}
