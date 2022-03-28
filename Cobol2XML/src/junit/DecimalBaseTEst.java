package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import parse.tokens.Token;

public class DecimalBaseTEst {

	@Test
	public void test() {
		String x = "decimal to base test";
		Token t = new Token(x);
//		assertTrue(t.isNumber());
		assertTrue(t.isWord());
//		assertFalse(t.isSymbol());
	}

}
