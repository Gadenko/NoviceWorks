import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NoviceTest {


    @Test
    void giveMeTheResultFromTheCalculation() {
        assertEquals(9,Novice.giveMeACalculation(3,2));
    }
    @Test
    void giveMeTheResultFromTheCalculationFalse() {
        assertEquals(0,Novice.giveMeACalculation(0,2));
    }
    @Test
    void giveMeTheResultFromTheCalculationNegative() {
        assertEquals(9,Novice.giveMeACalculation(-3,2));
    }
}