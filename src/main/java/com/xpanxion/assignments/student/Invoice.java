package com.xpanxion.assignments.student;

import java.util.ArrayList;

public class Invoice extends Base{
    private final ArrayList<Product> invoiceList;

    public Invoice(int n) {
        super(n);
        this.invoiceList = new ArrayList<>();

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
