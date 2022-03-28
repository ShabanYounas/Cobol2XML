package junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AtAssembler.class, DecimalBaseTEst.class, InnerMainAssemblerTest.class, mainLogicAssmblerTest.class,
		moveAssembler.class, NumTest.class, ParserTest.class, SearchAssmblerTest.class, SymbolTest.class,
		ThroughAssmblerTest.class, TokenTest.class, WhenAssemblerTest.class, WNumberAssembler.class })
public class AllTests {

}
