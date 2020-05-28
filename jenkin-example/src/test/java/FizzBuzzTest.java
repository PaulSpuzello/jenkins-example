import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

class FizzBuzzTest {
	
	public FizzBuzz fB;
	
	@Test
	public void testFizz() {
		String fizzBuzz = fB.play(3);
		Assertions.assertEquals(fizzBuzz, "Fiz");
	}
}