import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for the base currency and target currency
        System.out.println("Enter the base currency (e.g., USD, EUR, INR): ");
        String baseCurrency = scanner.nextLine().toUpperCase();

        System.out.println("Enter the target currency (e.g., USD, EUR, INR): ");
        String targetCurrency = scanner.nextLine().toUpperCase();

        // Define a simple conversion rate map (for demonstration purposes)
        double conversionRate = getConversionRate(baseCurrency, targetCurrency);
        
        if (conversionRate == -1) {
            System.out.println("Conversion rate not available for the selected currencies.");
            return;
        }

        // Prompt for the amount to be converted
        System.out.println("Enter the amount to convert: ");
        double amount = scanner.nextDouble();

        // Perform the conversion
        double convertedAmount = amount * conversionRate;

        // Display the result
        System.out.println("Converted amount: " + convertedAmount + " " + targetCurrency);
    }

    // A simple method to return conversion rates for demonstration purposes
    public static double getConversionRate(String base, String target) {
        // Define some example exchange rates
        if (base.equals("USD") && target.equals("EUR")) {
            return 0.85; // Example conversion rate (USD to EUR)
        } else if (base.equals("USD") && target.equals("INR")) {
            return 74.0; // Example conversion rate (USD to INR)
        } else if (base.equals("EUR") && target.equals("USD")) {
            return 1.18; // Example conversion rate (EUR to USD)
        } else if (base.equals("INR") && target.equals("USD")) {
            return 0.013; // Example conversion rate (INR to USD)
        } else {
            return -1; // Return -1 if no conversion rate is available
        }
    }
}
