package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        Client client = new Client("Jan", "Kowalski", 2531);

        LocalDateTime dateOfOrder = LocalDateTime.of(2021,04,01,13,13);

        CashPayment cashPayment = new CashPayment();

        Product product = new Product(1426, 12.99, 2);

        return new OrderRequest(client, dateOfOrder, cashPayment, product);
    }

}
