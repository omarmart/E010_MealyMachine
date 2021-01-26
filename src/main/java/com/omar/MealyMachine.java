package com.omar;

import java.util.List;

public class MealyMachine {
    private List<Node> nodes;
    private List<Character> symbols;
    private Node initialNode;
    private Node finalNode;
    private Node currentNode;

    public MealyMachine(String configPath) {
        initializeMachine(configPath);
    }

    /**
     * Reads a Mealy machine config file to load the configuration
     */
    private void initializeMachine(String path) {
        loadFile(path);
        currentNode = initialNode;
    }

    /**
     * Checks if the given input is valid for the current machine
     * @param input the input that will be checked
     */
    public boolean validateString(String input) {
        for (Character symbol : input.toCharArray()) {
            if (symbols.contains(symbol)) {
                currentNode = currentNode.getTargetNode(symbol);
            } else {
                //TODO: throw new Exception();
            }
        }

        return currentNode.getName().equals(finalNode.getName());
    }

    public List<Character> getSymbols() {
        return symbols;
    }

    public void loadFile(String path) {
        //TODO
        //comprobar buen formato
        //comprobar que los nodos, simbolos, etc coincidan con el abecedario
    }
}
