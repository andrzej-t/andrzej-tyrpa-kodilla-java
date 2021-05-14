package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave() {
        //Given
        Invoice invoice = new Invoice();

        //When
        invoiceDao.save(invoice);

        //Then
        int id = invoice.getId();
        Optional<Invoice> readInvoice = invoiceDao.findById(id);
        assertTrue(readInvoice.isPresent());

        //CleanUp
        invoiceDao.deleteById(id);
    }
}
