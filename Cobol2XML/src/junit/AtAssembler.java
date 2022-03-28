package junit;

import static org.junit.Assert.*;

import parse.Assembly;
import parse.tokens.Token;


import org.junit.Test;

import cobol.Cobol;

public class AtAssembler {

	@Test
	public void test() {
		String x = "at Assembler Test";
		Token t = new Token(x);
//		assertTrue(t.isNumber());
		assertTrue(t.isWord());
		assertFalse(t.isSymbol());
	}
}
