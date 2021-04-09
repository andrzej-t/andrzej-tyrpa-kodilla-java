package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ProductOrderService implements OrderService {

    public boolean order(final Client client, final LocalDateTime dateOfOrder, final CashPayment cashPayment, final Product product) {

        System.out.println("Product is ordered by: " + client.getName() + " " + client.getSurname());
        System.out.println("Client ID: " + client.getClientID());
        System.out.println("Date of order: " + dateOfOrder);
        System.out.println("Payment after delivery: " + cashPayment.isPayed());
        System.out.println("Product ID: " + product.getProductId());
        System.out.println("Product price: " + product.getProductPrice());
        System.out.println("Number of ordered products: " + product.getNumberOrderedProducts());

        return true;
    }

}
