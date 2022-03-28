package junit;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import parse.tokens.Token;

class DivideTest {

	@Test
	void test() {
		String x = "Divide test ";
		char w= ' ';
		int i = 0;
		Token t = new Token(i);
		assertTrue(t.isNumber());
//		assertFalse(t.isNumber());
//		assertTrue(t.isWord());
//		assertFalse(t.isWord());
//		assertFalse(t.isSymbol());
//		assertTrue(t.isSymbol());

	}

}
