package dogozat_Junit;

import org.junit.Test;
import static org.junit.Assert.*;

public class ThecodesTest {
    Thecodes adat = new Thecodes();

    @Test
    public void testDividersNumber() {
        assertEquals(4, adat.dividersNumber(6));}
    @Test
    public void testDividersNumber1(){
        assertEquals(2, adat.dividersNumber(1));

    }
    @Test
    public void testDividersNumber2() {
        assertEquals(2, adat.dividersNumber(7));

    }

    @Test
    public void testMaxOfThree() {
        assertEquals(3, adat.maxOfThree(1, 2, 3));}

    @Test
    public void testMaxOfThree1() {
        assertEquals(4, adat.maxOfThree(4, 3, 2));}
    @Test
    public void testMaxOfThree2() {
        assertEquals(5, adat.maxOfThree(3, 5, 2));}
    @Test
    public void testFizzBuzz() {
        assertEquals("Fizz", adat.fizzBuzz(3));
    }
    @Test
    public void testFizzBuzz2() {
        assertEquals("FizzBuzz", adat.fizzBuzz(15));
    }
    @Test
    public void testFizzBuzz3() {
        assertEquals("Buzz", adat.fizzBuzz(5));
    }
    @Test
    public void testFizzBuzz4() {
        assertEquals("32", adat.fizzBuzz(32));
    }
    @Test
    public void testIsVowel() {
        assertTrue(adat.isVowel('a'));
    }
    @Test
    public void testIsVowel2() {
        assertTrue(adat.isVowel('s'));
    }
    @Test
    public void testIsVowel3() {
        assertTrue(adat.isVowel('m'));
    }
    @Test
    public void testIsVowel4() {
        assertTrue(adat.isVowel('i'));
    }
}
