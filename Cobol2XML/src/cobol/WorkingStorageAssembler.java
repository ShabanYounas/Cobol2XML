//package cobol;
//
//import parse.Assembler;
//import parse.Assembly;
//import parse.tokens.Token;
//
//public class WorkingStorageAssembler extends Assembler {
//
//	@Override
//	public void workOn(Assembly a) {
//		// TODO Auto-generated method stub
//		Cobol c = new Cobol();
//		Token t = (Token) a.pop();
//		c.setWorkignStorageSection(t.sval());
//		a.setTarget(c);
//	}
//
//}
