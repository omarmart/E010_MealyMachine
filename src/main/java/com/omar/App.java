package com.omar;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        try {
            //MealyMachine machine = new MealyMachine(args[0]);
            MealyMachine machine = new MealyMachine("configPath");

            printHeader(machine);
            startMachine(machine);

        } catch (Exception e) {
            System.out.println("Valid input.");
        }
    }

    /**
     * Prints instructions on how to use the software and the valid symbols to use
     * @param machine the machine from which the valid symbols will be taken
     */
    private static void printHeader(MealyMachine machine) {
        System.out.println("Enter words with the accepted symbols to see if they are valid.");
        System.out.println("Accepted Symbols:");

        for (Character symbol : machine.getSymbols()) {
            System.out.println("-> " + symbol);
        }

        System.out.println("Enter exit to exit the program");
    }

    /**
     * Repeatedly requests the user for input that will be verified by the MealyMachine
     * @param machine the machine that will check the user input
     */
    public static void startMachine(MealyMachine machine) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String input = sc.nextLine();

            if (input.equals("exit")) {
                return;
            }

            if (machine.validateString(input)) {
                System.out.println("Valid input.");
            } else {
                System.out.println("Invalid input.");

            }
        }
    }

}
