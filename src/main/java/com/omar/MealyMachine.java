package com.omar;

import java.util.List;
import java.util.Scanner;

public class MealyMachine {
    private MealyConfig mealyConfig;
    private Node currentNode;

    public MealyMachine(String configPath) {
        initializeMachine(configPath);
    }

    /**
     * Reads a Mealy machine config file to load the configuration
     */
    private void initializeMachine(String path) {
        mealyConfig.loadFile(path);
        currentNode = mealyConfig.getInitialNode();
    }

    /**
     * Checks if the given input is valid for the current machine
     * @param input the input that will be checked
     */
    public boolean validateString(String input) {
        List<Character> symbols = mealyConfig.getSymbols();
        for (Character symbol : input.toCharArray()) {
            if (symbols.contains(symbol)) {
                currentNode = currentNode.getTargetNode(symbol);
            } else {
                //TODO: throw new Exception();
            }
        }

        return currentNode.getName().equals(mealyConfig.getFinalNode().getName());
    }

    public List<Character> getSymbols() {
        return mealyConfig.getSymbols();
    }
}
