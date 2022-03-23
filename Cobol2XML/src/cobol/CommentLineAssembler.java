package cobol;

import parse.Assembler;

import parse.*;
import parse.tokens.*;
import parse.Assembly;

public class CommentLineAssembler extends Assembler {

	@Override
	public void workOn(Assembly a) {
		// TODO Auto-generated method stub
		Cobol c = new Cobol();
		Token t = (Token) a.pop();
		if(t.sval() != null) {
		c.setCommentLine(t.sval().trim());
		a.setTarget(c); }

	}

}
