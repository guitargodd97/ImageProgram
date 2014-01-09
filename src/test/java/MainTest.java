package test.java;

public class MainTest {
	public void returnTrueTest() {
		Main man = new Main();
		assertEquals("Equals true", true, man.returnTrue(true));
	}
}