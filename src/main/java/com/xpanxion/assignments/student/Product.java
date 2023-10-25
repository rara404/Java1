package com.xpanxion.assignments.student;

public class Product extends Base {
    private String productName;
    private double cost;

    public Product(int productID, String productName, double cost) {
        super(productID);
        this.productName = productName;
        this.cost = cost;
    }

    public int getProductID() {
        return super.getID();
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
                "productID=" + super.getID() +
                ", productName='" + productName + '\'' +
                ", cost=" + cost +
                '}';
    }

}
