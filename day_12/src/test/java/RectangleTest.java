import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class RectangleTest {
    @Nested
    class TestingAreaFunction{
        @Test
        public void areaOfLengthTenAndBreadthFiveIsFifty(){
            Rectangle ar = new Rectangle(10,5);
            double area = ar.area();
            double exp = 50;
            Assertions.assertEquals(area,exp);
        }
        @Test
        public void throwExceptionWhenMeasurementsBecomeNegativeOrZero(){
            Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Rectangle ar = new Rectangle(-2,-4);
                ar.area();
            });
        }

        @Test
        public void verifyAreaForDecimalMeasurements(){
            Rectangle ar = new Rectangle(6.5,5);
            double area = ar.area();
            double exp = 32.5;
            Assertions.assertEquals(area,exp);
        }
    }

    @Nested
    class TestingPerimeterFunction{
        @Test
        public void perimeterOfLengthTenAndBreadthFiveIsFifty(){
            Rectangle ar = new Rectangle(10,5);
            double area = ar.perimeter();
            double exp = 30;
            Assertions.assertEquals(area,exp);
        }
        @Test
        public void throwExceptionWhenMeasurementsBecomeNegativeOrZero(){
            Assertions.assertThrows(IllegalArgumentException.class, () -> {
                Rectangle ar = new Rectangle(-2,-4);
                ar.perimeter();
            });
        }

        @Test
        public void verifyPerimeterForDecimalMeasurements(){
            Rectangle ar = new Rectangle(2.3,4.5);
            double area = ar.perimeter();
            double exp = 13.6;
            Assertions.assertEquals(area,exp);
        }
    }
}
