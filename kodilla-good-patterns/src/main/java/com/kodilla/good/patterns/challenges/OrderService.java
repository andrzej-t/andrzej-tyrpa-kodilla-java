package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface OrderService {
    boolean order(Client client, LocalDateTime dateOfOrder, CashPayment cashPayment, Product product);
}
