import java.io.CharArrayReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public void fileWriter(String amount, String fromUnit, String toUnit, String convertedAmount) throws IOException {
        FileHandler fw = new FileHandler();
        fw.writeIntoFile("-----------------Currency Converting from " + fromUnit +" to " + toUnit +"-----------------------------");
        fw.writeIntoFile("Currency chosen by the user => " + fromUnit);
        fw.writeIntoFile("Currency converted by the user => " + toUnit);
        fw.writeIntoFile("User entered Amount => " + amount);
        fw.writeIntoFile("Converted Amount => " + convertedAmount);
        fw.writeIntoFile("-----------------------Thank You------------------------------------");
    }

    public void header(){
        System.out.println("------------------WELCOME TO My CURRENCY SERVICE ----------------------------------");
    }
    public void footer(){
        System.out.println("------------------THANK YOU FOR CHOOSING OUR SERVICE----------------------------" +
                "\n-----------------------HAVE A NICE DAY----------------------------------");
    }

    public void divider(){
        System.out.println("*****************************************************************");
    }

    public static void main(String[] args) throws IOException {
        CurrencyConvertorDefinition currency = new CurrencyConvertorDefinition();
        Main main = new Main();
        int toCurrency, fromCurrency;
        double amount = 0;
        double convertedAmount = 0;
        int i = 0;
        Scanner sc = new Scanner(System.in);
        main.header();
        do {
            main.divider();
            System.out.println("From which currency You want to Convert ?");
            System.out.println(" 1.RUPEE\n 2.DOLLAR\n 3.POUND\n 4.EURO\n 5.SWISS FRANC\n 6.EXIT");
            fromCurrency = sc.nextInt();
            System.out.println("How much Money you want to convert ?");
            amount = sc.nextFloat();
            switch (fromCurrency) {
                case 1:
                    System.out.println("To which currency You want to Convert ?");
                    System.out.println(" 1.RUPEE\n 2.DOLLAR\n 3.POUND\n 4.EURO\n 5.SWISS FRANC");
                    toCurrency = sc.nextInt();
                    switch (toCurrency) {
                        case 1:
                            convertedAmount = currency.CurrencyConvertorDefinition(amount, "INR", "INR");
                            System.out.println(convertedAmount);
                            main.fileWriter(String.valueOf(amount), "INR", "INR", String.valueOf(convertedAmount));
                            break;
                        case 2:
                            convertedAmount = currency.CurrencyConvertorDefinition(amount, "INR", "DOLLAR");
                            System.out.println(convertedAmount);
                            main.fileWriter(String.valueOf(amount), "INR", "DOLLAR", String.valueOf(convertedAmount));
                            break;
                        case 3:
                            convertedAmount = currency.CurrencyConvertorDefinition(amount, "INR", "POUND");
                            System.out.println(convertedAmount);
                            main.fileWriter(String.valueOf(amount), "INR", "POUND", String.valueOf(convertedAmount));
                            break;
                        case 4:
                            convertedAmount = currency.CurrencyConvertorDefinition(amount, "INR", "EURO");
                            System.out.println(convertedAmount);
                            main.fileWriter(String.valueOf(amount), "INR", "EURO", String.valueOf(convertedAmount));
                            break;
                        case 5:
                            convertedAmount = currency.CurrencyConvertorDefinition(amount, "INR", "SWISS FRANC");
                            System.out.println(convertedAmount);
                            main.fileWriter(String.valueOf(amount), "INR", "SWISS FRANC", String.valueOf(convertedAmount));
                            break;
                        default:
                            throw new IllegalArgumentException("Make sure selected currency is valid");
                    }
                    break;
                case 2:
                    System.out.println("To which currency You want to Convert ?");
                    System.out.println(" 1.RUPEE\n 2.DOLLAR\n 3.POUND\n 4.EURO\n 5.SWISS FRANC");
                    toCurrency = sc.nextInt();
                    switch (toCurrency) {
                        case 1:
                            convertedAmount = currency.CurrencyConvertorDefinition(amount, "DOLLAR", "INR");
                            System.out.println(convertedAmount);
                            main.fileWriter(String.valueOf(amount), "DOLLAR", "INR", String.valueOf(convertedAmount));
                            break;
                        case 2:
                            convertedAmount = currency.CurrencyConvertorDefinition(amount, "DOLLAR", "DOLLAR");
                            System.out.println(convertedAmount);
                            main.fileWriter(String.valueOf(amount), "DOLLAR", "DOLLAR", String.valueOf(convertedAmount));
                            break;
                        case 3:
                            convertedAmount = currency.CurrencyConvertorDefinition(amount, "DOLLAR", "POUND");
                            System.out.println(convertedAmount);
                            main.fileWriter(String.valueOf(amount), "DOLLAR", "POUND", String.valueOf(convertedAmount));
                            break;
                        case 4:
                            convertedAmount = currency.CurrencyConvertorDefinition(amount, "DOLLAR", "EURO");
                            System.out.println(convertedAmount);
                            main.fileWriter(String.valueOf(amount), "DOLLAR", "EURO", String.valueOf(convertedAmount));
                            break;
                        case 5:
                            convertedAmount = currency.CurrencyConvertorDefinition(amount, "DOLLAR", "SWISS FRANC");
                            System.out.println(convertedAmount);
                            main.fileWriter(String.valueOf(amount), "DOLLAR", "SWISS FRANC", String.valueOf(convertedAmount));
                            break;
                        default:
                            throw new IllegalArgumentException("Make sure selected currency is valid");
                    }
                    break;
                case 3:
                    System.out.println("To which currency You want to Convert ?");
                    System.out.println(" 1.RUPEE\n 2.DOLLAR\n 3.POUND\n 4.EURO\n 5.SWISS FRANC");
                    toCurrency = sc.nextInt();
                    switch (toCurrency) {
                        case 1:
                            convertedAmount = currency.CurrencyConvertorDefinition(amount, "POUND", "INR");
                            System.out.println(convertedAmount);
                            main.fileWriter(String.valueOf(amount), "PUND", "INR", String.valueOf(convertedAmount));
                            break;
                        case 2:
                            convertedAmount = currency.CurrencyConvertorDefinition(amount, "POUND", "DOLLAR");
                            System.out.println(convertedAmount);
                            main.fileWriter(String.valueOf(amount), "POUND", "DOLLAR", String.valueOf(convertedAmount));
                            break;
                        case 3:
                            convertedAmount = currency.CurrencyConvertorDefinition(amount, "POUND", "POUND");
                            System.out.println(convertedAmount);
                            main.fileWriter(String.valueOf(amount), "POUND", "POUND", String.valueOf(convertedAmount));
                            break;
                        case 4:
                            convertedAmount = currency.CurrencyConvertorDefinition(amount, "POUND", "EURO");
                            System.out.println(convertedAmount);
                            main.fileWriter(String.valueOf(amount), "POUND", "EURO", String.valueOf(convertedAmount));
                            break;
                        case 5:
                            convertedAmount = currency.CurrencyConvertorDefinition(amount, "POUND", "SWISS FRANC");
                            System.out.println(convertedAmount);
                            main.fileWriter(String.valueOf(amount), "POUND", "SWISS FRANC", String.valueOf(convertedAmount));
                            break;
                        default:
                            throw new IllegalArgumentException("Make sure selected currency is valid");
                    }
                    break;
                case 4:
                    System.out.println("To which currency You want to Convert ?");
                    System.out.println(" 1.RUPEE\n 2.DOLLAR\n 3.POUND\n 4.EURO\n 5.SWISS FRANC");
                    toCurrency = sc.nextInt();
                    switch (toCurrency) {
                        case 1:
                            convertedAmount = currency.CurrencyConvertorDefinition(amount, "EURO", "INR");
                            System.out.println(convertedAmount);
                            main.fileWriter(String.valueOf(amount), "EURO", "INR", String.valueOf(convertedAmount));
                            break;
                        case 2:
                            convertedAmount = currency.CurrencyConvertorDefinition(amount, "EURO", "DOLLAR");
                            System.out.println(convertedAmount);
                            main.fileWriter(String.valueOf(amount), "EURO", "DOLLAR", String.valueOf(convertedAmount));
                            break;
                        case 3:
                            convertedAmount = currency.CurrencyConvertorDefinition(amount, "EURO", "POUND");
                            System.out.println(convertedAmount);
                            main.fileWriter(String.valueOf(amount), "EURO", "POUND", String.valueOf(convertedAmount));
                            break;
                        case 4:
                            convertedAmount = currency.CurrencyConvertorDefinition(amount, "EURO", "EURO");
                            System.out.println(convertedAmount);
                            main.fileWriter(String.valueOf(amount), "EURO", "EURO", String.valueOf(convertedAmount));
                            break;
                        case 5:
                            convertedAmount = currency.CurrencyConvertorDefinition(amount, "EURO", "SWISS FRANC");
                            System.out.println(convertedAmount);
                            main.fileWriter(String.valueOf(amount), "EURO", "SWISS FRANC", String.valueOf(convertedAmount));
                            break;
                        default:
                            throw new IllegalArgumentException("Make sure selected currency is valid");
                    }
                    break;
                case 5:
                    System.out.println("To which currency You want to Convert ?");
                    System.out.println(" 1.RUPEE\n 2.DOLLAR\n 3.POUND\n 4.EURO\n 5.SWISS FRANC");
                    toCurrency = sc.nextInt();
                    switch (toCurrency) {
                        case 1:
                            convertedAmount = currency.CurrencyConvertorDefinition(amount, "SWISS FRANC", "INR");
                            System.out.println(convertedAmount);
                            main.fileWriter(String.valueOf(amount), "SWISS FRANC", "INR", String.valueOf(convertedAmount));
                            break;
                        case 2:
                            convertedAmount = currency.CurrencyConvertorDefinition(amount, "SWISS FRANC", "DOLLAR");
                            System.out.println(convertedAmount);
                            main.fileWriter(String.valueOf(amount), "SWISS FRANC", "DOLLAR", String.valueOf(convertedAmount));
                            break;
                        case 3:
                            convertedAmount = currency.CurrencyConvertorDefinition(amount, "SWISS FRANC", "POUND");
                            System.out.println(convertedAmount);
                            main.fileWriter(String.valueOf(amount), "SWISS FRANC", "POUND", String.valueOf(convertedAmount));
                            break;
                        case 4:
                            convertedAmount = currency.CurrencyConvertorDefinition(amount, "SWISS FRANC", "EURO");
                            System.out.println(convertedAmount);
                            main.fileWriter(String.valueOf(amount), "SWISS FRANC", "EURO", String.valueOf(convertedAmount));
                            break;
                        case 5:
                            convertedAmount = currency.CurrencyConvertorDefinition(amount, "SWISS FRANC", "SWISS FRANC");
                            System.out.println(convertedAmount);
                            main.fileWriter(String.valueOf(amount), "SWISS FRANC", "SWISS FRANC", String.valueOf(convertedAmount));
                            break;
                        default:
                            throw new IllegalArgumentException("Make sure selected currency is valid");
                    }
                    break;
                case 6:
                    i = 1;
                default:
                    throw new IllegalArgumentException("Make sure selected currency is valid");
            }
        } while (i == 0);
        main.footer();
    }
}
