import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LengthConvertorTest {
    private LengthConvertor lc;
    @BeforeEach
    public void setup(){
        lc = new LengthConvertor();
    }
    @Test
    public void checkOneCentimeterEqualsToOneCentimeter(){
        double actualValue = lc.convertor(1,"cm","cm");
        double expectedValue = 1;
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void checkMeterToCentimeterConvertor(){
        double actualValue = lc.convertor(1,"m","cm");;
        double expectedValue = 100;
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void checkCentimeterToKilometer(){
        double actualValue = lc.convertor(100,"cm","km");;
        double expectedValue = 0.001;
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void verifySumOfOneMeterAndHundredCentimeterGivesTwoMeter(){
        double actualValue = 1 + lc.convertor(100,"cm","m");;
        double expectedValue = 2;
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void verifySumOfTwoHundredCentimeterAndOneKilometerGivesOneLakhTwoHundredCentimeter(){
        double actualValue = 200 + lc.convertor(1,"km","cm");;
        double expectedValue = 100200;
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void verifySubtractionOfOneMeterAndFiftyCentiMeterGivesPointFiveMeter(){
        double actualValue = 1 - lc.convertor(50,"cm","m");;
        double expectedValue = 0.5;
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void verifySubtractionOfTwoThousandCentimeterAndOneMeterGivesThousandNineHundredCentimeter(){
        double actualValue = 2000 - lc.convertor(1,"m","cm");;
        double expectedValue = 1900;
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void throwsExceptionWhenMeasurementIsLessThanOrEqualToZero(){
        assertThrows(IllegalArgumentException.class, ()-> {
            lc.convertor(-1,"cm","cm");
        });
    }
}
