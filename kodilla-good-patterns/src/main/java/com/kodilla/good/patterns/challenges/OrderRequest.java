package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequest {

    private Client client;
    private LocalDateTime dateOfOrder;

    public OrderRequest(final Client client, final LocalDateTime dateOfOrder) {
        this.client = client;
        this.dateOfOrder = dateOfOrder;
    }

    public Client getClient() {
        return client;
    }

    public LocalDateTime getDateOfOrder() {
        return dateOfOrder;
    }
}
