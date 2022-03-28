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
				+ "\r\n"
				+ "\r\n"
				+ "date-written.  07-mar-1995 - mb.\r\n"
				+ "\r\n"
				+ "remarks.\r\n"
				+ "\r\n"
				+ "     This program convert a value of a generic system base to a numeric value\r\n"
				+ "     and viceversa.\r\n"
				+ "\r\n"
				+ "data division.\r\n"
				+ "working-storage section.\r\n"
				+ "\r\n"
				+ "77  ind                                 pic 99 comp-x.\r\n"
				+ "77  rest_divide                         pic 99.\r\n"
				+ "\r\n"
				+ "01  w_number                            pic 9(16).\r\n"
				+ "01  entry_number                        pic 9(16).\r\n"
				+ "01  entry_char   redefines entry_number pic x(16).\r\n"
				+ "\r\n"
				+ "01  current_base                        pic 9(2).\r\n"
				+ "    88  base_2                          value 2.\r\n"
				+ "    88  base_8                          value 8.\r\n"
				+ "    88  base_10                         value 10.\r\n"
				+ "    88  base_16                         value 16.\r\n"
				+ "\r\n"
				+ "01  hex_dec_data                        pic x(48) value\r\n"
				+ "    \"000101202303404505606707808909A10B11C12D13E14F15\".\r\n"
				+ "\r\n"
				+ "01  hex_decimal_table redefines hex_dec_data.\r\n"
				+ "    03  hex_table\r\n"
				+ "        occurs 16 times\r\n"
				+ "        ascending key is hex_value, dec_value\r\n"
				+ "        indexed by hex_idx.\r\n"
				+ "        05  hex_value                   pic x.\r\n"
				+ "        05  dec_value                   pic 99.\r\n"
				+ "\r\n"
				+ "procedure division.\r\n"
				+ "\r\n"
				+ "main-logic.\r\n"
				+ "\r\n"
				+ "    display window erase\r\n"
				+ "\r\n"
				+ "    display \"Base:  \" no\r\n"
				+ "    accept current_base convert\r\n"
				+ "    display \"Value: \" no\r\n"
				+ "    accept entry_char\r\n"
				+ "\r\n"
				+ "    perform base-to-decimal thru base-to-decimal-ex\r\n"
				+ "\r\n"
				+ "    display \"Decimal  value: \" entry_char\r\n"
				+ "\r\n"
				+ "    perform decimal-to-base thru decimal-to-base-ex\r\n"
				+ "\r\n"
				+ "    display \"Base: \" current_base \" value: \" entry_char\r\n"
				+ "\r\n"
				+ "    accept omitted\r\n"
				+ "\r\n"
				+ "    goback.\r\n"
				+ "\r\n"
				+ "***---\r\n"
				+ "***---  convert from decimal to base system\r\n"
				+ "***---\r\n"
				+ "decimal-to-base.\r\n"
				+ "    move entry_number  to w_number\r\n"
				+ "    move spaces        to entry_char\r\n"
				+ "    move 16    to ind");
		
		Assembly in = new TokenAssembly(t);
		
		Assembly out = p.bestMatch(in);
		
		
		
		System.out.println(in);
		System.out.println();
		System.out.println(out);
		assertTrue( out.stackIsEmpty() );
		}

}
