import java.util.*;

public class Codsoft_task3 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base currency code : ");
        String baseCurrency = sc.next().toUpperCase();

        System.out.print("Enter the target currency code : ");
        String targetCurrency = sc.next().toUpperCase();

        double exchangeRate = getExchangeRate(baseCurrency, targetCurrency);

        if (exchangeRate != -1) {
            System.out.print("Enter the amount to convert: ");
            double amount = sc.nextDouble();

            double convertedAmount = amount * exchangeRate;

            System.out.println("Converted amount: " + convertedAmount + " " + targetCurrency);
        }

        sc.close();
    }

    private static double getExchangeRate(String baseCurrency, String targetCurrency) {
        
        if (baseCurrency.equals("USD") && targetCurrency.equals("EUR")) {
            return 0.85;
        } else {
            System.out.println("Unsupported currency pair.");
            return -1;
        }
    }
}