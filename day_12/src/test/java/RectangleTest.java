import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;

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
        public void perimeterOfLengthTenAndBreadthFiveIsThirty(){
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
            Rectangle ar = new Rectangle(5.4,3.2);
            DecimalFormat df = new DecimalFormat("#.#");
            double area = ar.perimeter();
            double exp = 17.2;
            Assertions.assertEquals(df.format(area),df.format(exp));
        }
    }
}
