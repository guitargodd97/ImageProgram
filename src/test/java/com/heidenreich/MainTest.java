package test.java.com.heidenreich;

import main.java.com.heidenreich.Main;

public class MainTest {
	public void returnTrueTest() {
		Main man = new Main();
		assertEquals("Equals true", true, man.returnTrue(true));
	}

	private void assertEquals(String string, boolean b, boolean returnTrue) {
	}
}