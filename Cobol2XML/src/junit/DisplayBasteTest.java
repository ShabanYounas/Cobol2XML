package junit;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import parse.tokens.Token;

class DisplayBasteTest {

	@Test
	void test() {
		String x = "Display base tester";
		char w= ' ';
		Token t = new Token(x);
//		assertTrue(t.isNumber());
		assertTrue(t.isWord());
		assertFalse(t.isSymbol());
	}

}
