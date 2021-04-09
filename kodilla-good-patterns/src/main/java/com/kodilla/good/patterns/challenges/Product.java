package com.kodilla.good.patterns.challenges;

public class Product {
    int productId;
    double productPrice;
    int numberOrderedProducts;

    public Product(int productId, double productPrice, int numberOrderedProducts) {
        this.productId = productId;
        this.productPrice = productPrice;
        this.numberOrderedProducts = numberOrderedProducts;
    }

    public int getProductId() {
        return productId;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public int getNumberOrderedProducts() {
        return numberOrderedProducts;
    }
}
