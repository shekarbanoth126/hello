 import java.util.Scanner;  // ✅ Capital S

public class PoundsToKilograms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // ✅ Capital S

        final double POUND_TO_KG = 0.453592;

        System.out.print("Enter weight in pounds: ");
        double pounds = scanner.nextDouble();

        double kilograms = pounds * POUND_TO_KG;

        System.out.println(pounds + " pounds = " + kilograms + " kilograms");

        scanner.close();
    }
}
