import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the payment amount: \n");
        double payment = scanner.nextDouble();
        scanner.close();

        Locale INDIA = new Locale("en", "IN"); //code works fine - problem is country code
        NumberFormat usCurrency = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat indianCurrency = NumberFormat.getCurrencyInstance(INDIA);
        NumberFormat chineseCurrency = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat frenchCurrency = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("US: " + usCurrency.format(payment));
        System.out.println("India: " + indianCurrency.format(payment));
        System.out.println("Chin: " + chineseCurrency.format(payment));
        System.out.println("France: " + frenchCurrency.format(payment));
;
    }
}
