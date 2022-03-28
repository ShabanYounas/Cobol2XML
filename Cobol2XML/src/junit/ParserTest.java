package junit;

import static org.junit.Assert.*;
import cobol.CobolParser;
import parse.Assembly;
import parse.Parser;
import parse.tokens.TokenAssembly;
import parse.tokens.Tokenizer;

import org.junit.Test;

public class ParserTest {

	@Test
	public void test() {
		
		Tokenizer t = CobolParser.tokenizer();
		
		Parser p = CobolParser.start();
		
		t.setString("identification division.\r\n"
				+ "program-id.  base_jb.\r\n"
				);
		
		Assembly in = new TokenAssembly(t);
		
		Assembly out = p.bestMatch(in);
		
		
		
		System.out.println(in);
		System.out.println();
		System.out.println(out);
		assertTrue( out.stackIsEmpty() );
		}

}
