import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private Calculator cal;

    @BeforeEach
    public void setup(){
        cal = new Calculator();
    }

    @Nested
    class TestingAddFunction{
        @Test
        public void TenPlusFiveIsFifteen(){
            double ans = cal.add(10,5);
            double exp = 15;
            Assertions.assertEquals(ans,exp);
        }
        @Test
        public void NegativeTenPlusFiveIsNegativeFive(){
            double ans = cal.add(-10,5);
            double exp = -5;
            Assertions.assertEquals(ans,exp);
        }
        @Test
        public void FivePlusZeroIsFive(){
            double ans = cal.add(5,0);
            double exp = 5;
            Assertions.assertEquals(ans,exp);
        }
    }

    @Nested
    class TestingSubFunction{
        @Test
        public void TenMinusFiveIsFive(){
            double ans = cal.sub(10,5);
            double exp = 5;
            Assertions.assertEquals(ans,exp);
        }
        @Test
        public void NegativeTenMinusFiveIsNegativeFifteen(){
            double ans = cal.sub(-10,5);
            double exp = -15;
            Assertions.assertEquals(ans,exp);
        }
        @Test
        public void FiveMinusSixIsNegativeOne(){
            double ans = cal.sub(5,6);
            double exp = -1;
            Assertions.assertEquals(ans,exp);
        }
    }

    @Nested
    class TestingMulFunction{
        @Test
        public void TenMultiplyFiveIsFifty(){
            double ans = cal.mul(10,5);
            double exp = 50;
            Assertions.assertEquals(ans,exp);
        }
        @Test
        public void NegativeTenMultiplyFiveIsNegativeFifty(){
            double ans = cal.mul(-10,5);
            double exp = -50;
            Assertions.assertEquals(ans,exp);
        }
        @Test
        public void FiveMultiplyZeroIsZero(){
            double ans = cal.mul(5,0);
            double exp = 0;
            Assertions.assertEquals(ans,exp);
        }
    }

    @Nested
    class TestingDivFunction{
        @Test
        public void TenDividedFiveIsTwo(){
            double ans = cal.div(10,5);
            double exp = 2;
            Assertions.assertEquals(ans,exp);
        }
        @Test
        public void NegativeTenPlusFiveIsNegativeTwo(){
            double ans = cal.div(-10,5);
            double exp = -2;
            Assertions.assertEquals(ans,exp);
        }
        @Test
        public void throwExceptionWhenDividedByZero(){
            Assertions.assertThrows(ArithmeticException.class, () -> cal.div(10,0));
        }
    }
}
