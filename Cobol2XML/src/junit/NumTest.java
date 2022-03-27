package junit;

import static org.junit.Assert.*;
import parse.tokens.Num;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class NumTest {

	@Test
	public void test() {
		Num num = new Num();
		int maxDepth = 2;
		int depth = 1;
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList = num.randomExpansion(maxDepth, depth);
//		System.out.println(((List<String>) num).size());
//		for(int i = 0; i <= num.randomExpansion.lenght(); i++) {
			System.out.print(num);
//		}
			
		assertFalse( arrayList.isEmpty() );
	}

}
