import org.testng.annotations.Test;

public class SimpleTest {

	@Test
	public void setupTest() {
		System.err.println("Test param: " + System.getProperty("test.param"));
	}

}
