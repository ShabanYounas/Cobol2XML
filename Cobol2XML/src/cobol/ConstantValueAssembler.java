package cobol;

import parse.Assembler;

import parse.Assembly;
import parse.*;
import parse.tokens.*;


public class ConstantValueAssembler extends Assembler {

	@Override
	public void workOn(Assembly a) {
		// TODO Auto-generated method stub
		
			Cobol c = new Cobol();
			Token t = (Token) a.pop();
			c.setConstantValue( t.nval() );
			//System.out.println("Token string[4]: " + 
			c.getConstantValue();
			t = (Token) a.pop();
			//This should be the word "value" so we don't need any 
		
			//String tokenString = t.sval();
			//System.out.println("Token string[3]: " + tokenString );
			t = (Token) a.pop();
			c.setConstantName(t.sval() );
			//System.out.println("Token string[2]: " + 
			c.getConstantName();
			t = (Token) a.pop();
			c.setLineNumber( (int) Math.round(t.nval()) );
			//System.out.println("Token string[2]: " + 
			c.getLineNumber();
			a.setTarget(c);
			
	}

}
