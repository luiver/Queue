package com.codecool;

public class CustomQueue {
    private Node head;
    private Node tail;

    public CustomQueue() {
    }

    public void enqueue(String value) {
        Node node = new Node(value);
        if (tail != null) {
            tail.setNextNode(node);
        }
        tail = node;
        if (isEmpty()) {
            head = node;
        }
    }

    public String peek() {
        return head.getValue();
    }

    public String dequeue() {
        String value = peek();
        head = head.getNextNode();
        if (isEmpty()) {
            tail = null;
        }
        return value;
    }

    public boolean isEmpty() {
        return head == null;
    }
}
