package com.streams;

public class Product {
    String productName;
    String productId;
    float productPrice;

    public Product(String productName, String productId, float productPrice) {
        this.productName = productName;
        this.productId = productId;
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productId='" + productId + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }
}
