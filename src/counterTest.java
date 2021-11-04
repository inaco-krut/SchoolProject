import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class counterTest {
    @Test
    public void LineCounter () {
        // Arrange
        counter program = new counter();
        // Act
        program.LineCounter(0,"");
        int actual = program.returnLines();
        // Assert
        int expected = 0;
        assertEquals(actual, expected);
    }
    @Test
    public void LookForStop() {
        // Arrange
        counter program = new counter();
        // Act
        boolean actual = program.lookForStop(String.valueOf(true));
        // Assert
        boolean expected = true;
        assertEquals(true,true);
    }
    @Test
    public void returnWord() {
        // Arrange
        counter program = new counter();
        // Act
        program.WordCounter("");
        int actual = program.returnWord();
        // Assert
        int expected = -1;
        assertEquals(actual, expected);
    }
}