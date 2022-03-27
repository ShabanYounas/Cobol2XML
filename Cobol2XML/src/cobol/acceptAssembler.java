/**
 * 
 */
package cobol;

import parse.Assembler;
import parse.Assembly;
import parse.tokens.Token;

/**
 * @author agd986
 *
 */
public class acceptAssembler extends Assembler {

	@Override
	public void workOn(Assembly a) {
		// TODO Auto-generated method stub
		Cobol c = new Cobol();
		Token t = (Token) a.pop();
		c.setAccept(t.sval());
		a.setTarget(c);
	}

}
