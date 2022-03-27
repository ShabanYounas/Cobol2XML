package cobol;

import parse.Assembler;
import parse.Assembly;
import parse.tokens.Token;
import parse.*;

public class MainLogicAssembler extends Assembler {

	@Override
	public void workOn(Assembly a) {
		// TODO Auto-generated method stub
			Cobol c = new Cobol();
			
			Token t = (Token) a.pop();
			c.setMainLogic(t.sval());
			
			a.setTarget(c);
			
			
			
			
		}
	}


