public class WeightConvertor extends UnitConvertorDefinition{
    public double convertor(double unit, String fromUnit, String toUnit) {
        if (unit <= 0) {
            throw new IllegalArgumentException("Invalid Unit");
        } else {
            switch (fromUnit) {
                case "g":
                    return convertToGram(unit, toUnit);
                case "kg":
                    return convertToKilogram(unit, toUnit);
                default:
                    throw new IllegalArgumentException("units either not valid or not supported");
            }
        }
    }

    public double convertToGram(double value, String toUnit) {
        switch (toUnit) {
            case "g":
                return super.sameToSameConvertor(value);
            case "kg":
                return super.baseToKiloConvertor(value);
            default:
                throw new IllegalArgumentException("units either not valid or not supported");
        }
    }

    public double convertToKilogram(double value, String toUnit) {
        switch (toUnit) {
            case "g":
                return super.kiloToBaseConvertor(value);
            case "kg":
                return super.sameToSameConvertor(value);
            default:
                throw new IllegalArgumentException("units either not valid or not supported");
        }
    }

}
