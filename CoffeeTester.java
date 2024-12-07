/*
 * David Doughty
 * CSCE 145 001
 */

import java.util.Scanner;

public class CoffeeTester {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        String userChoice;
        System.out.println("Welcome to the Coffee Hour!!!");

        do {
            // create two coffee objects by prompting the user
            Coffee coffee1 = createCoffee(key, "first");
            Coffee coffee2 = createCoffee(key, "second");

            // print details of both coffees
            System.out.println("\nCoffee Name: " + coffee1.getName());
            System.out.println("Caffeine Amount: " + coffee1.getCaffeineContent());
            System.out.println("It would take " + coffee1.riskyAmount() + " cups of " + coffee1.getName() + " before it’s dangerous to drink more.");

            System.out.println("\nCoffee Name: " + coffee2.getName());
            System.out.println("Caffeine Amount: " + coffee2.getCaffeineContent());
            System.out.println("It would take " + coffee2.riskyAmount() + " cups of " + coffee2.getName() + " before it’s dangerous to drink more.");

            // check if both coffees are the same
            if(coffee1.riskyAmount() == coffee2.riskyAmount()) {
            	System.out.println("\nAre both coffee’s the same? True" );
            }
            else {
            	System.out.println("\nAre both coffee’s the same? False" );
            }
            

            // prompt user to continue or stop
            System.out.print("\nDo you want to create more coffee objects? Enter “yes” or “no”: ");
            userChoice = key.next(); 
        } while (userChoice.equalsIgnoreCase("Yes"));

        System.out.println("Goodbye!");
    }

    // method that creates coffee object by prompting the user
    public static Coffee createCoffee(Scanner key, String coffeeOrder) {
        // prompt for the name of the coffee
        System.out.println("What’s the name of the " + coffeeOrder + " coffee?");
        key.nextLine();
        String name = key.nextLine(); 

        int caffeineContent;
        // keep prompting for caffeine content until the user provides a valid one
        while (true) {
            System.out.println("What’s the caffeine content?");
            caffeineContent = key.nextInt();
            //input validation
            if (caffeineContent >= 50 && caffeineContent <= 300) {
                break; // valid caffeine content
            } 
            else {
                System.out.println("Caffeine content must be between 50 and 300 mg. Please enter a valid value.");
            }
        }

        // create and return the coffee object
        return new Coffee(name, caffeineContent);
    }
}
