import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertorTest {
    private Convertor convertor;
    @BeforeEach
    public void setup(){
        convertor = new Convertor();;
    }

    @Test
    public void checkForOneCentimeterIsOneCentimeter(){
        double actualMeasurement= convertor.unitConvertor(1, "cm","cm");
        double expectedMeasurement= 1;
        assertEquals(expectedMeasurement, actualMeasurement);
    }

    @Test
    public void checkForOneMeterIsHundredCentimeters(){
        double actualMeasurement= convertor.unitConvertor(1,"m","cm");
        double expectedMeasurement= 100;
        assertEquals(expectedMeasurement, actualMeasurement);
    }

    @Test
    public void checkForHundredCentimeterIsZeroPointZeroZeroOneKilometers(){
        double actualMeasurement= convertor.unitConvertor(100, "cm","km");
        double expectedMeasurement= 0.001;
        assertEquals(expectedMeasurement, actualMeasurement);
    }

    @Test
    public void throwsExceptionWhenMeasurementIsLessThanOrEqualToZero(){
        assertThrows(IllegalArgumentException.class, ()-> {
            convertor.unitConvertor(-1,"cm","cm");
        });
    }


    @Test
    public void throwsExceptionWhenUnitIsMillimeter(){
        assertThrows(IllegalArgumentException.class, ()-> {
            convertor.unitConvertor(1, "mm","mm");
        });
    }


    @Test
    public void throwsExceptionWhenUnitIsInvalidUnit(){
        assertThrows(IllegalArgumentException.class, ()-> {
            convertor.unitConvertor(1, "km","km");
        });
    }

    @Nested
    public class ArithmaticOperationsOnUnits{
        @Test
        public void checkIfOneMeterPlusHundresCentimeterIsTwoMeter(){
            double actualMeasurement= convertor.add(1,"m",100,"cm");
            double expectedMeasurement = 2;
            assertEquals(expectedMeasurement,actualMeasurement);
        }

        @Test
        public void checkIfOneMeterMinusFiftyCentimeterIsZeroPointFiveMeterMeter(){
            double actualMeasurement= convertor.subtract(1,"m",50,"cm");
            double expectedMeasurement = 0.5;
            assertEquals(expectedMeasurement,actualMeasurement);
        }

        @Test
        public  void checkIfTwoHundredCentimeterPlusOneKilometerIsHundredThousandTwoHundredCentimeter(){
            double actualMeasurement = convertor.add(200,"cm",1,"km");
            double expectedMeasurement = 100200;
            assertEquals(expectedMeasurement,actualMeasurement);
        }

        @Test
        public void checkIfTwoThousandCentimeterMinusOneMeterIsNinteenHundredCentimeter(){
            double actualMeasurement= convertor.subtract(2000,"cm",1,"m");
            double expectedMeasurement = 1900;
            assertEquals(expectedMeasurement,actualMeasurement);
        }

        @Test
        public void checkIfFourThousandMeterMinuseTwoMeterIsTwoThousandMeter(){
            double actualMeasurement= convertor.subtract(4000,"m",2,"km");
            double expectedMeasurement = 2000;
            assertEquals(expectedMeasurement,actualMeasurement);
        }

        @Test
        public void checkIf4KilometerMinuseTwoKilometerIs2Kilometer(){
            double actualMeasurement= convertor.subtract(4,"km",2,"km");
            double expectedMeasurement = 2;
            assertEquals(expectedMeasurement,actualMeasurement);
        }
    }


}