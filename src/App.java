import java.util.Scanner;

import javax.annotation.processing.SupportedOptions;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a starting measurement. Type number.");
        System.out.println("1. Tbs 2. Tsp 3. Cup");
        int startingMeasurement = Integer.valueOf(scanner.nextLine());
        System.out.println("How many?");
        int startingQuantity = Integer.valueOf(scanner.nextLine());

        System.out.println("Convert to: ");
        System.out.println("1. Tbs 2. Tsp 3. Cup");
        int endingMeasurement = Integer.valueOf(scanner.nextLine());

        double finalOutput = 0;
        //Tbs conversions
        if (startingMeasurement == 1) {
            //Tbs to Tsp
            if (endingMeasurement == 2) {
                finalOutput = startingQuantity * 3;
            }
            //Tbs to Cup
            if (endingMeasurement == 3) {
                finalOutput = (double) startingQuantity * 0.0625;
            }
        }

        System.out.println("Conversion: " + finalOutput);
    }
}
