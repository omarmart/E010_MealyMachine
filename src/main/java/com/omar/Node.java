package com.omar;

import java.util.Map;

public class Node {
    private String name;
    private Map<Character, Node> transitionAlphabet;

    public Node(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Map<Character, Node> getAlphabet() {
        return transitionAlphabet;
    }

    public void addTransition(Character symbol, Node targetNode) {
        transitionAlphabet.put(symbol, targetNode);
    }

    public Node getTargetNode(Character symbol) {
        return transitionAlphabet.get(symbol);
    }

}
