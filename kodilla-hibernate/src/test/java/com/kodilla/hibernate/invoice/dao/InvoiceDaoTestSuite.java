package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave() {
        //Given
        Product product1 = new Product("pencil");
        Product product2 = new Product("pen");
        Item item1 = new Item(product1, BigDecimal.valueOf(1.5), 4,BigDecimal.valueOf(6));
        Item item2 = new Item(product2, BigDecimal.valueOf(2.3), 4,BigDecimal.valueOf(9.2));
        Invoice invoice = new Invoice("2021/05/14/001");

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);

        List<Item> itemList = new ArrayList<>();
        itemList.add(item1);
        itemList.add(item2);
        invoice.setItems(itemList);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();
        int itemsSize = invoice.getItems().size();
        Invoice invoiceDB = invoiceDao.findById(id);
        String productDB = invoiceDB.getItems().get(0).getProduct().getName();

        //Then
        Assertions.assertEquals(1,invoiceDao.count() );
        Assertions.assertEquals("pencil", productDB);
        Assertions.assertEquals(itemsSize, invoiceDB.getItems().size());

        //CleanUp
        invoiceDao.deleteById(id);

    }
}