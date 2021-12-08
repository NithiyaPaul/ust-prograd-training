import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    @Nested
    class TestingAreaFunction{
        @Test
        public void areaOfSideFiveISTwentyFive(){
            Square ar = new Square(5);
            double area = ar.area();
            double exp = 25;
            Assertions.assertEquals(area,exp);
        }
        @Test
        public void throwExceptionWhenMeasurementsBecomeNegativeOrZero(){
            Assertions.assertThrows(IllegalArgumentException.class, () -> {
                Square ar = new Square(-2);
                ar.area();
            });
        }

        @Test
        public void verifyAreaForDecimalMeasurements(){
            Rectangle ar = new Square(6.5);
            double area = ar.area();
            double exp = 42.25;
            Assertions.assertEquals(area,exp);
        }
    }
    @Nested
    class TestingPerimeterFunction{
        @Test
        public void perimeterOfSideFiveISTwenty(){
            Square ar = new Square(5);
            double perimeter = ar.perimeter();
            double exp = 20;
            Assertions.assertEquals(perimeter,exp);
        }
        @Test
        public void throwExceptionWhenMeasurementsBecomeNegativeOrZero(){
            Assertions.assertThrows(IllegalArgumentException.class, () -> {
                Square ar = new Square(-2);
                ar.perimeter();
            });
        }

        @Test
        public void verifyAreaForDecimalMeasurements(){
            Rectangle ar = new Square(10.25);
            double perimeter = ar.perimeter();
            double exp = 41;
            Assertions.assertEquals(perimeter,exp);
        }
    }

}