import java.util.Scanner;

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

        if (startingMeasurement == 1) {
            Tablespoon tbs = new Tablespoon(startingQuantity);
            if (endingMeasurement == 1) {
                System.out.println("Error: Cannot convert to same unit");
            }
            if (endingMeasurement == 2) {
                finalOutput = tbs.toTsp();
                System.out.println("Conversion: " + finalOutput);
            }
            if (endingMeasurement == 3) {
                finalOutput = tbs.toCup();
                System.out.println("Conversion: " + finalOutput);
            }
        }

        if (startingMeasurement == 2) {
            Teaspoon tsp = new Teaspoon(startingQuantity);
            if (endingMeasurement == 2) {
                System.out.println("Error: Cannot convert to same unit");
            }
            if (endingMeasurement == 1) {
                finalOutput = tsp.toTbs();
                System.out.println("Conversion: " + finalOutput);
            }
            if (endingMeasurement == 3) {
                finalOutput = tsp.toCups();
                System.out.println("Conversion: " + finalOutput);
            }
        }

        if (startingMeasurement == 3) {
            Cup cup = new Cup(startingQuantity) ;

            if (endingMeasurement == 3) {
                System.out.println("Error: Cannot convert to same unit");
            }
            if (endingMeasurement == 1) {
                finalOutput = cup.toTbs();
                System.out.println("Conversion: " + finalOutput);
            }
            if (endingMeasurement == 2) {
                finalOutput = cup.toTsp();
                System.out.println("Conversion: " + finalOutput);
            }
        }
        
    }
}
