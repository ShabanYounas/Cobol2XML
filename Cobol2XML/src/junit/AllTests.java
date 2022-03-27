package junit;

import org.junit.runner.RunWith;

import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AllTests.class, NumTest.class, ParserTest.class, SymbolTest.class, TokenTest.class })

public class AllTests {

}
