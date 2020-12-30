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

            loadHeader(machine);
            startChecking(machine);

        } catch (Exception e) {
            System.out.println("Valid input.");
        }
    }

    private static void loadHeader(MealyMachine machine) {
        System.out.println("Enter words with the accepted symbols to see if they are valid.");
        System.out.println("Accepted Symbols:");

        for (Character symbol : machine.getSymbols()) {
            System.out.println("-> " + symbol);
        }

        System.out.println("Enter exit to exit the program");
    }

    public static void startChecking(MealyMachine machine) {
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
