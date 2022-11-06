package testing;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Divide {

	@Test
	void test() {
		JunitTesting test=new JunitTesting();
		int output=(int) test.divide(5,5);
		assertEquals(1.0, output);
	}
}