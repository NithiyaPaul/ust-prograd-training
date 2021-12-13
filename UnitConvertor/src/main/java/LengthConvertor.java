public class LengthConvertor extends UnitConvertorDefinition {
    public double convertor(double unit, String fromUnit, String toUnit) {
        if (unit <= 0) {
            throw new IllegalArgumentException("Invalid Unit");
        } else {
            switch (fromUnit) {
                case "cm":
                    return convertToCentimeter(unit, toUnit);
                case "km":
                    return convertToKilometer(unit, toUnit);
                case "m":
                    return convertToMeter(unit, toUnit);
                default:
                    throw new IllegalArgumentException("units either not valid or not supported");
            }
        }
    }

    public double convertToCentimeter(double value, String toUnit) {
        switch (toUnit) {
            case "cm":
                return super.sameToSameConvertor(value);
            case "m":
                return super.centiToBaseConvertor(value);
            case "km":
                return super.centiToKiloConvertor(value);
            default:
                throw new IllegalArgumentException("units either not valid or not supported");
        }
    }

    public double convertToMeter(double value, String toUnit) {
        switch (toUnit) {
            case "cm":
                return super.baseToCentiConvertor(value);
            case "m":
                return super.sameToSameConvertor(value);
            case "km":
                return super.baseToKiloConvertor(value);
            default:
                throw new IllegalArgumentException("units either not valid or not supported");
        }
    }

    public double convertToKilometer(double value, String toUnit) {
        switch (toUnit) {
            case "cm":
                return super.kiloToCentiConvertor(value);
            case "m":
                return super.baseToKiloConvertor(value);
            case "km":
                return super.sameToSameConvertor(value);
            default:
                throw new IllegalArgumentException("units either not valid or not supported");
        }
    }

}

