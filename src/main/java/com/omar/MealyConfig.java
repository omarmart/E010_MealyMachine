package com.omar;

import java.util.List;

public class MealyConfig {

    private List<Node> nodes;
    private List<Character> symbols;
    private Node initialNode;
    private Node finalNode;

    public List<Node> getNodes() {
        return nodes;
    }

    public List<Character> getSymbols() {
        return symbols;
    }

    public Node getInitialNode() {
        return initialNode;
    }

    public Node getFinalNode() {
        return finalNode;
    }

    public void loadFile(String path) {
        //TODO
        //comprobar buen formato
        //comprobar que los nodos, simbolos, etc coincidan con el abecedario
    }
}
