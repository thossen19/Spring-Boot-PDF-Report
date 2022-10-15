package com.dev.thossen.pdfreport22.service;

import java.util.List;
import com.dev.thossen.pdfreport22.model.Invoice;

public interface InvoiceService {

    public Invoice saveInvice(Invoice invoice);
    public List<Invoice> getAllInvoices();
    public Invoice getInvoiceById(Long id);
    public void deleteInvoiceById(Long id);
    public void updateInvoice(Invoice invoice);

}