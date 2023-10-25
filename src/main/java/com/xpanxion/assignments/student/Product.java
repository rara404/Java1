package com.xpanxion.assignments.student;

public class Product {
    private int productID;
    private String productName;
    private double cost;

    public Product(int productID, String productName, double cost) {
        this.productID = productID;
        this.productName = productName;
        this.cost = cost;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productID=" + productID +
                ", productName='" + productName + '\'' +
                ", cost=" + cost +
                '}';
    }

}
