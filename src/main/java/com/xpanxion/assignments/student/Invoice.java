package com.xpanxion.assignments.student;

import java.util.ArrayList;

public class Invoice {
    private int invoiceID;
    private ArrayList<Product> invoiceList;

    public Invoice(int n) {
        this.invoiceList = new ArrayList<>();
        this.invoiceID = n;
    }

    public void addProduct(Product n) {
        this.invoiceList.add(n);
    }

    public double getTotalCost() {
        double total = 0;

        for (Product n: invoiceList) {
            total += n.getCost();
        }

        return total;
    }
}
