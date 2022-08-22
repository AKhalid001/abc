import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Demo1Test {

	@Test
	void test() {
		StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("String");
        stringBuilder.append("Test");

        assertEquals("StringTest", stringBuilder.toString());
    }

}
