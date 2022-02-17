package prog2_8_min;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class TestProg2_8 {
	
	@Test
	public void testMin() {
		int[] testData = new int[] {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
		int result = Prog2_8.min(testData);
		int expected = -22;
		assertTrue(result == expected);
	}

}
