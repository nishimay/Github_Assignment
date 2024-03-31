package pkge01;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Count_no_of_digitsTest {

    @Test
    public void testCountDigitsWithPositiveNumber() {
        int number = 12345;
        int expectedCount = 5;
        assertEquals(expectedCount, Count_no_of_digits.countDigits(number));
    }

    @Test
    public void testCountDigitsWithNegativeNumber() {
        int number = -9876;
        int expectedCount = 4;
        assertEquals(expectedCount, Count_no_of_digits.countDigits(number));
    }
}
