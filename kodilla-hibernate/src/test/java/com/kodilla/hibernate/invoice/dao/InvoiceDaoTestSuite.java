package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;


@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Autowired
    private ItemDao itemDao;

    @Test
    void testInvoiceDaoSave() {
        //Given
        Product product = new Product("pencil");
        Item item = new Item(product, BigDecimal.valueOf(2.3), 4,BigDecimal.valueOf(9.2));
        Invoice invoice = new Invoice("2021/05/14/001", List.of(item));

        //When
        invoiceDao.save(invoice);
        itemDao.save(item);

        //Then
        int id = invoice.getId();
        Assertions.assertEquals(1,invoiceDao.count() );

        int idItem = item.getId();
        Assertions.assertEquals(1, itemDao.count());

        //CleanUp
        invoiceDao.deleteById(id);
        itemDao.deleteById(idItem);

    }
}
