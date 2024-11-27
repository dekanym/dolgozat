package dogozat;

import org.junit.Test;
import static org.junit.Assert.*;

public class ThecodesTest {
    Thecodes adat = new Thecodes();

    @Test
    public void testDividersNumber() {
        assertEquals(4, adat.dividersNumber(6));
        assertEquals(2, adat.dividersNumber(2));
    }

    @Test
    public void testMaxOfThree() {
        assertEquals(3, adat.maxOfThree(1, 2, 3));
        assertEquals(10, adat.maxOfThree(10, 2, 3));
    }

    @Test
    public void testFizzBuzz() {
        assertEquals("Fizz", adat.fizzBuzz(3));
        assertEquals("Buzz", adat.fizzBuzz(5));
        assertEquals("FizzBuzz", adat.fizzBuzz(15));
        assertEquals("4", adat.fizzBuzz(4));
    }

    @Test
    public void testIsVowel() {
        assertTrue(adat.isVowel('a'));
        assertTrue(adat.isVowel('e'));
        assertFalse(adat.isVowel('k'));
    }
}
