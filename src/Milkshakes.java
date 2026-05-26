// Author:  Kyle Chapman
// Created: May 25, 2025
// Description: Polls the user about different types of milkshakes
// and uses that input to determine which milkshakes are the most
// popular.

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
        int totalShakes;
        boolean isValid = false;
        String choice;

        // Input.
        do {
            System.out.println("1. Vanilla");
            System.out.println("2. Chocolate");
            System.out.println("3. Camel Milk");
            System.out.println("4. Tally and Exit");
            System.out.println("Please enter a menu choice (1-4): ");

            choice = input.nextLine().strip();

            switch (choice) {
                case "1":
                    // Vanilla milkshake input.
                    while (!isValid) {
                        System.out.print("Enter the number of vanilla shakes sold: ");
                        if (input.hasNextInt()) {
                            vanillaShakes += input.nextInt();
                            isValid = true;
                        } else {
                            System.out.println("Please enter a whole number: ");
                            input.next();
                        }
                    }
                    break;
                case "2":
                    // Chocolate milkshake input.
                    isValid = false;
                    while (!isValid) {
                        System.out.print("Enter the number of chocolate shakes sold: ");
                        if (input.hasNextInt()) {
                            chocolateShakes += input.nextInt();
                            isValid = true;
                        } else {
                            System.out.println("Please enter a whole number: ");
                            input.next();
                        }
                    }
                    break;
                case "3":
                    // Camel milk milkshakes.
                    isValid = false;
                    while (!isValid) {
                        System.out.print("Enter the number of camel milk shakes sold: ");
                        if (input.hasNextInt()) {
                            camelMilkShakes += input.nextInt();
                            isValid = true;
                        } else {
                            System.out.println("Please enter a whole number: ");
                            input.next();
                        }
                    }
                    break;
            }

            // Here's one way to provide an error message.
            // We should discuss how this could be done in a "default" case - or otherwise.
            if (!choice.equals("1") && !choice.equals("2") && !choice.equals("3") && !choice.equals("4")) {
                System.out.println("Please select a valid menu option.");
            }

            // Input loop ends when the user enters 4.
        } while (!choice.equals("4"));

        // Processing.

        // For comparison, the comments are the processing from Python (without indentation)!
        // total_milk = vanilla + chocolate + strawberry
        totalShakes = vanillaShakes + chocolateShakes + camelMilkShakes;
        // if total_milk == 0:
        if (totalShakes == 0) {
            // print("No Milkshakes Sold :(")
            System.out.println("No Milkshakes Sold :(");
        } else {
            // else:
            // # Making the values percentages
            // vanilla_percent = vanilla/total_milk * 100
            // chocolate_percent = chocolate/total_milk * 100
            // strawberry_percent = strawberry/total_milk * 100
            vanillaPercent = (double)vanillaShakes/totalShakes * 100;
            chocolatePercent = (double)chocolateShakes/totalShakes * 100;
            camelMilkPercent = (double)camelMilkShakes/totalShakes * 100;

            // Output.
            // Again, comments are code from Python.
            // print("Vanilla Milkshakes: " + str(vanilla) + " or " + str(round(vanilla_percent,1))+ "%")
            System.out.printf("Vanilla Milkshakes: %d or %.2f%%%n", vanillaShakes, vanillaPercent);
            // print("Chocolate Milkshakes: " + str(chocolate) + " or " + str(round(chocolate_percent,1))+ "%")
            System.out.println("Chocolate Milkshakes: " + chocolateShakes + " or " + String.format("%.2f", chocolatePercent) + "%");
            // print("Strawberry Milkshakes: " + str(strawberry) + " or " + str(round(strawberry_percent,1))+ "%")
            System.out.printf("Camel Milk Milkshakes: %d or %.2f%%%n", camelMilkShakes, camelMilkPercent);
            // print("My Milkshake brings all the Camels to the yard!")
            System.out.println("Ishaan is silly.");
        }

        // Confirm close.
        System.out.print("\nPress Enter to end the program... ");
        // Wait for the user to press Enter.
        input.nextLine();
    }
}
