import static org.junit.Assert.assertEquals;
import org.junit.*;
/**
 * Testing class to test JUnit on new set up
 * @author Max Wayne
 *
 */
public class HelloTest {

	@Test
	public void testHello() {
		String actual = Hello.hello();
		String expected = "Hello, world!";
		
		assertEquals(expected, actual);
	}
}
