import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class counterTest {
    @Test
    public void LineCounter() {
        // Arrange
        counter program = new counter();
        // Act
        program.LineCounter(10, "Test");
        int actual = program.returnLines();
        // Assert
        int expected = 10;
        assertEquals(actual, expected);
    }

    @Test
    public void returnLongestWord() {
        // Arrange
        counter program = new counter();
        // Act
        program.longestWord("hej hejsansvejsan");
        String actual = program.returnLongestWord();
        // Assert
        String expected = "hejsansvejsan";
        assertEquals(actual, expected);
    }

    @Test
    public void LookForStop() {
        // Arrange
        counter program = new counter();
        // Act
        program.lookForStop("hej stop");
        boolean actual = program.returnStopper();
        // Assert
        boolean expected = true;
        assertEquals(actual, expected);
    }
}