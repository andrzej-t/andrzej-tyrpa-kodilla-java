package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ProductOrderService implements OrderService {

    public boolean order(final Client client, final LocalDateTime dateOfOrder) {

        System.out.println("Product is ordered by: " + client.getName() + " " + client.getSurname());
        System.out.println("Date of order: " + dateOfOrder);

        return true;
    }

}
