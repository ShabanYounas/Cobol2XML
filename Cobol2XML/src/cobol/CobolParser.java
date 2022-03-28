/*
 * @(#)CobolParser.java	 0.1.0
 *
 * Copyright (c) 2019 Julian M. Bass
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 *
 */
package cobol;

import parse.Alternation;
import parse.Empty;
import parse.Parser;
import parse.Sequence;
import parse.tokens.CaselessLiteral;
import parse.tokens.Num;
import parse.tokens.Symbol;
import parse.tokens.Tokenizer;
import parse.tokens.Word;

public class CobolParser {
	/**
	 * Return a parser that will recognize the selected COBOL source code constructs:
	 * 
	 * 
	 * This parser creates a <code>COBOL</code> object
	 * as an assembly's target.
	 *
	 * @return a parser that will recognize and build a 
	 *         <object>COBOL</object> from a source code file.
	 */
	public Parser cobol() {
		Alternation a = new Alternation();



		a.add( constantValue());

		a.add( ProgramID() );

		a.add( DivisionName() );

		a.add( SectionName() );

		a.add( DateWritten() );

		a.add( CommentLine() );

		//*******26/3/2022******
		
		a.add(  mainLogic()    );

		a.add(  displayBase()  );

		a.add(  perform()  );

		a.add(  accept()  );
		
		//******27/3/2022*******

		a.add(  through() );

		//		a.add(  workingStorageSection() );


		//		a.add(  hexData()  );

		a.add(  decimalBase() );

		a.add(   move()       );

		a.add(	 to()        );

		a.add(  divide() );
		
		a.add(  search () ) ; 
		
		a.add( 	wNumber());
		
		a.add(at());
		
		a.add(when());
		
//		a.add(is());

		a.add(new Empty());
		
		return a;
	}
//	protected Parser is() {
//		// TODO Auto-generated method stub
//		Sequence s = new Sequence();
////		s.add(new Word());s.add(new Word());
//		s.add(new CaselessLiteral(" = "));	
////		s.add(new Word());
////		s.add(new Symbol("="));
//		System.out.println(s);
//		
//		s.add(new Word(). setAssembler(new IsAssembler()));
//		return s;
//	}
	protected Parser when() {
		// TODO Auto-generated method stub
		Sequence s = new Sequence();

		s.add(new CaselessLiteral ("when"));
		s.add(new Word().setAssembler(new WhenAssembler()));
		return s;
	}
	protected Parser at() {
		// TODO Auto-generated method stub
		Sequence s = new Sequence();

	s.add(new CaselessLiteral ("at"));
	s.add(new Word().setAssembler(new AtAssembler()));
	return s;
	}
	protected Parser wNumber() {
		// TODO Auto-generated method stub
		
		Sequence s = new Sequence();
////		s.add(new Word());s.add(new Word());s.add(new Word());s.add(new Word());
		s.add(new Word());
//		s.add(new Symbol("_"));
		s.add(new CaselessLiteral ("w_number"));
		s.add(new Word().setAssembler(new WNumberAssembler()));
		return s;
	}
	protected Parser search() {
		// TODO Auto-generated method stub
		Sequence s = new Sequence();
			
		s.add(new CaselessLiteral ("search"));
		s.setAssembler(new SearchAssembler());
		s.add(new Word());s.add(new Word());
		
		return s;
	}
	protected Parser divide() {
		// TODO Auto-generated method stub
		Sequence s = new Sequence();
		//	s.add(new Word());
		s.add(new CaselessLiteral ("divide"));
		s.setAssembler(new DivideAssembler());
		s.add(new Word());
		return s;
	}
	protected Parser move() {
		// TODO Auto-generated method stub
		Sequence s = new Sequence();
		//	s.add(new Word());
		s.add(new CaselessLiteral ("move"));
		s.setAssembler(new MoveAssembler());
		s.add(new Word());
		return s;
	}

	protected Parser to() {
		// TODO Auto-generated method stub
		Sequence s = new Sequence();
		//		s.add(new Symbol(" ").discard());s.add(new Symbol(" ").discard());
		s.add(new Word());		s.add(new Num());s.add(new Word());	s.add(new Word());
		s.add(new CaselessLiteral("move"));
		s.add(new Word().setAssembler(new ToAssembler()));
		return s;


	}

	//	protected Parser mainLogic() {
	//		// TODO Auto-generated method stub
	//		Sequence s = new Sequence();
	//		s.add(new CaselessLiteral ("main-logic"));
	//		s.add(new Symbol('.').discard());
	//		s.setAssembler(new MainLogicAssembler());
	//		return s;
	//	}

	protected Parser decimalBase() {
		// TODO Auto-generated method stub
		Sequence s = new Sequence();
		s.add(new CaselessLiteral ("decimal-to-base"));
		s.add(new Symbol('.').discard());
		s.setAssembler(new DecimalBaseAssembler());
		return s;
	}

	//	protected Parser hexData() {
	//	// TODO Auto-generated method stub
	//	Sequence s = new Sequence();
	//	s.add(new Symbol("01"));
	//	
	////	System.out.print(s);
	//	//.add(new Word()
	//	s.add(new Word().setAssembler(new HexDataAssembler()));
	//	return s;

	//}

	//	protected Parser workingStorageSection() {
	//		// TODO Auto-generated method stub
	//		Sequence s = new Sequence();
	//		s.add(new CaselessLiteral("working-storage"));
	//		s.add(new Word().setAssembler(new WorkingStorageAssembler()));s.add(new Word());
	//		return s;
	//
	//	}

	protected Parser through() {
		// TODO Auto-generated method stub
		Sequence s = new Sequence();

		s.add(new CaselessLiteral("thru"));
		s.setAssembler(new throughAssembler());
		s.add(new Word());
		return s;
	}

	protected Parser accept() {
		// TODO Auto-generated method stub
		Sequence s = new Sequence();
		s.add(new CaselessLiteral("accept") );
		s.setAssembler(new acceptAssembler());
		s.add(new Word());
		return s;

	}

	protected Parser perform() {
		// TODO Auto-generated method stub
		Sequence s = new Sequence();
		s.add(new CaselessLiteral("perform") ); 
		s.add(new Word());
		//		s.add(new Word());
		s.setAssembler(new InnerMainLogicPerformAssembler());
		return s;
	}


	protected Parser displayBase() {
		// TODO Auto-generated method stub
		Sequence s = new Sequence();
		s.add(new CaselessLiteral ("Base"));
		s.add(new Word());
		s.setAssembler(new DisplayBaseAssembler());

		return s;

	}

	protected Parser mainLogic() {
		// TODO Auto-generated method stub
		Sequence s = new Sequence();
		s.add(new CaselessLiteral ("main-logic"));
		s.add(new Symbol('.').discard());
		s.setAssembler(new MainLogicAssembler());
		return s;
	}


	// TODO Auto-generated method stub
	protected Parser CommentLine() {
		//System.out.println("commentLine()");
		Sequence s = new Sequence();
		s.add(new Symbol("*"));
		s.add(new Symbol("*"));
		s.add(new Symbol("*"));
		s.add(new Symbol("-"));
		s.add(new Symbol("-"));
		s.add(new Symbol("-"));
		s.add(new Word().setAssembler(new CommentLineAssembler()) );
		//s.setAssembler(new CommentLineAssembler());
		return s;	
	}

	protected Parser constantValue() {
		// TODO Auto-generated method stub
		Sequence s = new Sequence();
		s.add(new Num() );
		s.add(new Word() );
		s.add(new CaselessLiteral("value") );
		s.add(new Num() );
		s.setAssembler(new ConstantValueAssembler());
		return s;
	}

	/*
	 * Return a parser that will recognize the grammar:
	 * 
	 *    Program Identifier = Word
	 *
	 */
	protected Parser ProgramID() {
		Sequence s = new Sequence();
		s.add(new CaselessLiteral("program-id") );
		s.add(new Symbol('.').discard());	
		s.add(new Word().setAssembler(new Program_idAssembler()));
		return s;
	}

	/*
	 * Return a parser that will recognise the grammar:
	 * 
	 *    <divisionName> division
	 *
	 */
	protected Parser DivisionName() {
		Sequence s = new Sequence();

		s.add(new Word().setAssembler(new DivisionAssembler()));
		s.add(new Symbol('-').discard());
		s.add(new CaselessLiteral("division") );
		s.add(new Symbol('.').discard());


		return s;
	}

	/*
	 * Return a parser that will recognize the grammar:
	 * 
	 *    Section Name = Word
	 *
	 */
	protected Parser SectionName() {
		Sequence s = new Sequence();
		s.add(new Word().setAssembler(new SectionNameAssembler()));
		s.add(new CaselessLiteral("section") );
		s.add(new Symbol('.').discard());	

		return s;
	}

	/*
	 * Return a parser that will recognise the grammar:
	 * 
	 *    working-storage section
	 *
	 */
	protected Parser DateWritten() {
		Sequence s = new Sequence();
		s.add(new CaselessLiteral("date-written") );
		s.add(new Symbol('.').discard());
		s.add(new Num());
		s.add(new Symbol('-').discard());

		//This next Word actually contains month and year (which are extracted in DateAssembler
		s.add(new Word());
		s.add(new Symbol('-').discard());
		s.add(new Word().discard());
		s.add(new Symbol('.').discard());
		s.setAssembler(new DateAssembler());
		return s;
	}


	/**
	 * Return the primary parser for this class -- cobol().
	 *
	 * @return the primary parser for this class -- cobol()
	 */
	public static Parser start() {
		return new CobolParser().cobol();
	}

	/**
	 * Returns a tokenizer that does not allow spaces to appear inside
	 * the "words" that identify cobol's grammar.
	 *
	 * @return a tokenizer that does not allow spaces to appear inside
	 * the "words" that identify cobol grammar.
	 */
	public static Tokenizer tokenizer() {
		Tokenizer t = new Tokenizer();
		t.wordState().setWordChars(' ',' ', false);
		return t;
	}



}
