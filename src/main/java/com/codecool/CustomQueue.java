package com.codecool;

public class CustomQueue {
    private Node head;
    private Node tail;

    public CustomQueue() {
    }

    public void enqueue(String value, Integer priority) {
        Node node = new Node(value);
        if (priority > 0) {
            Node currentHead = head;
            head = node;
            head.setNextNode(currentHead);
        } else {
            if (tail != null) {
                tail.setNextNode(node);
            }
            tail = node;
        }
        if (isEmpty()) {
            head = node;
        }
    }

    public String peek() throws Exception {
        if (isEmpty()){
            throw new Exception("Queue is empty");
        }
        return head.getValue();
    }

    public String dequeue() throws Exception {
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
