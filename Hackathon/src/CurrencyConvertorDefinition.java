import java.math.BigDecimal;
import java.math.RoundingMode;

public class CurrencyConvertorDefinition implements CurrencyConvertor{
    double CurrencyConvertorDefinition(double amount,String fromUnit,String toUnit){
        if(amount<=0){
            throw new IllegalArgumentException("Amount can't be zero or negative value");
        } else {
            switch (fromUnit){
                case "INR":
                    return rupeeCurrencyConvertor(amount,toUnit);
                case "DOLLAR":
                    return dollarCurrencyConvertor(amount,toUnit);
                case "POUND":
                    return poundCurrencyConvertor(amount,toUnit);
                case "EURO":
                    return euroCurrencyConvertor(amount,toUnit);
                case "SWISS FRANC":
                    return swissFrancCurrencyConvertor(amount,toUnit);
                default:
                    throw new IllegalArgumentException("make sure preferred currency is valid");
            }
        }
    }

//    Function to convert rupee to any currency
    public double rupeeCurrencyConvertor(double amount,String toUnit){
        switch (toUnit){
            case "INR":
                return sameToSameCurrency(amount);
            case "DOLLAR":
                return currencyToHighCurrency(amount,0.013);
            case "POUND":
                return currencyToHighCurrency(amount,0.0099);
            case "EURO":
            case "SWISS FRANC":
                return currencyToHighCurrency(amount,0.012);
            default:
                throw new IllegalArgumentException("make sure preferred currency is valid");
        }
    }

//    Function to convert dollar to any currency
    public double dollarCurrencyConvertor(double amount,String toUnit){
        switch (toUnit){
            case "INR":
                return currencyToHighCurrency(amount,76.08);
            case "DOLLAR":
                return sameToSameCurrency(amount);
            case "POUND":
                return currencyToHighCurrency(amount,0.76);
            case "EURO":
                return currencyToHighCurrency(amount,0.89);
            case "SWISS FRANC":
                return currencyToHighCurrency(amount,0.92);
            default:
                throw new IllegalArgumentException("make sure preferred currency is valid");
        }
    }

//    Function to convert Pound to any currency
    public double poundCurrencyConvertor(double amount,String toUnit){
        switch (toUnit){
            case "INR":
                return currencyToHighCurrency(amount,100.70);
            case "DOLLAR":
                return currencyToHighCurrency(amount,1.32);
            case "POUND":
                return sameToSameCurrency(amount);
            case "EURO":
                return currencyToHighCurrency(amount,1.18);
            case "SWISS FRANC":
                return currencyToHighCurrency(amount,1.22);
            default:
                throw new IllegalArgumentException("make sure preferred currency is valid");
        }
    }

//    Function to convert Euro to any currency
    public double euroCurrencyConvertor(double amount,String toUnit){
        switch (toUnit){
            case "INR":
                return currencyToHighCurrency(amount,85.69);
            case "DOLLAR":
                return currencyToHighCurrency(amount,1.13);
            case "POUND":
                return currencyToHighCurrency(amount,0.85);
            case "EURO":
                return sameToSameCurrency(amount);
            case "SWISS FRANC":
                return currencyToHighCurrency(amount,1.04);
            default:
                throw new IllegalArgumentException("make sure preferred currency is valid");
        }
    }

//    Function to convert swiss franc to any currency
    public double swissFrancCurrencyConvertor(double amount,String toUnit){
        switch (toUnit){
            case "INR":
                return currencyToHighCurrency(amount,82.30);
            case "DOLLAR":
                return currencyToHighCurrency(amount,1.08);
            case "POUND":
                return currencyToHighCurrency(amount,0.82);
            case "EURO":
                return currencyToHighCurrency(amount,0.96);
            case "SWISS FRANC":
                return sameToSameCurrency(amount);
            default:
                throw new IllegalArgumentException("make sure preferred currency is valid");
        }
    }
    public double sameToSameCurrency(double amount){
        return amount;
    }
    public double currencyToHighCurrency(double amount, double value){
        BigDecimal bd = new BigDecimal(amount*value).setScale(2, RoundingMode.HALF_UP);
        double newInput = bd.doubleValue();
        return newInput;
    }
}
