// Author:  Kyle Chapman
// Created: May 25, 2025
// Description: Polls the user about different types of milkshakes
// and uses that input to determine which milkshakes are the most
// popular.

import java.sql.SQLOutput;
import java.util.Scanner;

public class Milkshakes {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // Declarations.
        int vanillaShakes = 0;
        int chocolateShakes = 0;
        int camelMilkShakes = 0;
        double vanillaPercent;
        double chocolatePercent;
        double camelMilkPercent;
        int totalShakes = 0;
        boolean isValid = false;

        // Input.
        // Vanilla milkshake input.
        while (!isValid) {
            System.out.print("Enter the number of vanilla shakes sold: ");
            if (input.hasNextInt()) {
                vanillaShakes = input.nextInt();
                isValid = true;
            } else {
                System.out.println("Please enter a whole number: ");
                input.next();
            }
        }

        // Chocolate milkshake input.
        isValid = false;
        while (!isValid) {
            System.out.print("Enter the number of chocolate shakes sold: ");
            if (input.hasNextInt()) {
                chocolateShakes = input.nextInt();
                isValid = true;
            } else {
                System.out.println("Please enter a whole number: ");
                input.next();
            }
        }

        // Camel milk milkshakes.
        do {
            System.out.print("Enter the number of camel milk shakes sold: ");
            if (input.hasNextInt()) {
                camelMilkShakes = input.nextInt();
                isValid = true;
            } else {
                System.out.println("Please enter a whole number: ");
                input.next();
                isValid = false;
            }
        } while (!isValid);
        // Processing.

        // Output.

    }
}
