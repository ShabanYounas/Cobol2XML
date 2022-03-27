package cobol;

import parse.Assembler;
import parse.Assembly;
import parse.tokens.Token;

public class AtAssembler extends Assembler {

	@Override
	public void workOn(Assembly a) {
		// TODO Auto-generated method stub
		Cobol c = new Cobol();
		Token t = (Token) a.pop();
		c.setAt(t.sval().trim());
		a.setTarget(c);
	}

}
