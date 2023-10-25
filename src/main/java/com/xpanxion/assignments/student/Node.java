package com.xpanxion.assignments.student;

public class Node {
    Cat cat;
    Node next;

    public Node(Cat cat) {
        this.cat = cat;
        this.next = null;
    }

    public Node(Cat cat, Node next) {
        this.cat = cat;
        this.next = next;
    }
}
