package pkge01;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Add_two_integersTest {

    @Test
    public void testAdditionPositiveNumbers() {
        int num1 = 5;
        int num2 = 10;
        int expectedResult = 15;
        int actualResult = Add_two_integers.add(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testAdditionNegativeNumbers() {
        int num1 = -8;
        int num2 = -3;
        int expectedResult = -11;
        int actualResult = Add_two_integers.add(num1, num2);
        assertEquals(expectedResult, actualResult);
    }
}

