package cobol;

import parse.Assembler;

import parse.Assembly;
import parse.*;
import parse.tokens.*;

public class ConstantValueAssembler extends Assembler {

	public void workOn(Assembly a) {
		// TODO Auto-generated method stub
		
			Cobol c = new Cobol();
			Token t = (Token) a.pop();
			c.setConstantValue( t.nval() );
			
			
			//c.getConstantValue();
			t = (Token) a.pop();
			
			t = (Token) a.pop();
			c.setConstantName(t.sval());
			//c.getConstantName();
			
			t = (Token) a.pop();
			c.setLineNumber( (int) Math.round(t.nval()) );
			
			
			c.getLineNumber();
			a.setTarget(c);
			
	}

}
