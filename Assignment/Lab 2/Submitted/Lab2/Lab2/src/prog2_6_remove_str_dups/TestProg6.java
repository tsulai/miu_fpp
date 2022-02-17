package prog2_6_remove_str_dups;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

public class TestProg6 {

	@Test
	public void testRemoveDups() {
		String[] testData = new String[] {"horse", "dog", "cat", "horse","dog"};
		String result = Arrays.toString(Prog6.removeDups(testData));
		String expected = Arrays.toString(new String[] {"horse","dog","cat"});
		assertTrue(result.equals(expected));//Two Strings use .equals
	}

}
