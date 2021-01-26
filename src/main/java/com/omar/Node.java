package com.omar;

import java.util.Map;

public class Node {
    private String name;
    private Map<Character, Node> transitionTable;

    public Node(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Map<Character, Node> getAlphabet() {
        return transitionTable;
    }

    public void addTransition(Character symbol, Node targetNode) {
        transitionTable.put(symbol, targetNode);
    }

    public Node getTargetNode(Character symbol) {
        return transitionTable.get(symbol);
    }

}
