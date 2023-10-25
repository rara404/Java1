package com.xpanxion.assignments.student;

public class Queue {
    Node head;
    Node tail;

    public Queue() {
        this.head = null;
        this.tail = null;
    }

    public void enqueue(Cat cat) {
        Node node = new Node(cat);

        if (this.tail == null) {
            this.head = node;
            this.tail = node;
        } else {
            this.tail.next = node;
            this.tail = node;
        }
    }

    public void dequeue() {
        if (this.head == null) return;
        this.head = this.head.next;
        if (this.head == null) this.tail = null;
    }

    public boolean isEmpty() {
        return this.head == null && this.tail == null;
    }

    public void printQueue() {
        if (this.head == null) return;

        System.out.print("[");
        for (Node ptr = head; ptr != null; ptr = ptr.next) {
            System.out.print(ptr.cat.toString());
            if (ptr.next != null) System.out.print(", ");
        }
        System.out.println("]");
    }
}