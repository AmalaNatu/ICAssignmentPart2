package testing;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SquareTest {

	@Test
	void test() {
		JunitTesting test=new JunitTesting();
		int output=test.square(4);
		assertEquals(16, output);
	}
}
