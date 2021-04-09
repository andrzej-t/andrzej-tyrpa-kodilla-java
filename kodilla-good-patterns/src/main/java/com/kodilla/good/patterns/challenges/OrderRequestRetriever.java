package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        Client client = new Client("Jan", "Kowalski");

        LocalDateTime dateOfOrder = LocalDateTime.of(2021,04,01,13,13);

        return new OrderRequest(client, dateOfOrder);
    }

}
