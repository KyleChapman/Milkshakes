// Author:  Kyle Chapman
// Created: May 25, 2026
// Updated: May 26, 2026
// Description: Polls the user about different types of milkshakes
// and uses that input to determine which milkshakes are the most
// popular.

import java.util.Scanner;

public class Milkshakes {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // Declarations.
        // Quantities of milkshakes.
        int vanillaShakes = 0;
        int chocolateShakes = 0;
        int camelMilkShakes = 0;
        // Variables for percentages, used in the processing near the end of the program.
        // We could argue about whether these should be declared later:
        // See https://google.github.io/styleguide/javaguide.html#s4.8.2-variable-declarations .
        double vanillaPercent;
        double chocolatePercent;
        double camelMilkPercent;
        // A total number of shakes, used in division and to check for divide-by-zero.
        int totalShakes;
        // A boolean variable used to check for valid input.
        boolean isValid = false;
        // Represents the user's menu choice.
        String choice;

        // Input.
        // Use a do..while loop to force the user to enter an option at least once.
        // This loop continues until option 4 is selected.
        do {
            // Print a menu.
            System.out.println("1. Vanilla");
            System.out.println("2. Chocolate");
            System.out.println("3. Camel Milk");
            System.out.println("4. Tally and Exit");
            System.out.println("Please enter a menu choice (1-4): ");

            // Get a menu choice as a string. The strip() method is used to remove whitespace.
            choice = input.nextLine().strip();
            // Assume any further input is invalid.
            isValid = false;

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

        // Calculating a total makes the math a lot cleaner/shorter soon.
        totalShakes = vanillaShakes + chocolateShakes + camelMilkShakes;

        // This part is a check for a total of zero, since dividing by zero breaks math.
        // For comparison, these comments are the processing from Python (without indentation)!
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
            System.out.println("Thanks Ishaan.");
        }

        // Confirm close. Some people would insist on this.
        System.out.print("\nPress Enter to end the program... ");
        // Wait for the user to press Enter.
        input.nextLine();
    }
}
