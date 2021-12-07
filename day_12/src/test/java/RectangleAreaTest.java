import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class RectangleAreaTest {
    private RectangleArea ar;
    @BeforeEach
    public void setup(){
        ar = new RectangleArea();
    }
    @Nested
    class TestingAreaFunction{
        @Test
        public void lengthOfTenAndBreadthOfFiveGivesFifty(){
            double area = ar.area(10,5);
            double exp = 50;
            Assertions.assertEquals(area,exp);
        }

        @Test
        public void throwExceptionWhenMeasurementsBecomeNegativeOrZero(){
            Assertions.assertThrows(ArithmeticException.class, () -> ar.area(-2,-4));
        }

        @Test
        public void verifyAreaForDecimalMeasurements(){
            double area = ar.area(6.5,5);
            double exp = 32.5;
            Assertions.assertEquals(area,exp);
        }
    }
}
