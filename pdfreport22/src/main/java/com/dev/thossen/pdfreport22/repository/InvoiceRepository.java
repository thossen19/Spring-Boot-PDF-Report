package com.dev.thossen.pdfreport22.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dev.thossen.pdfreport22.model.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

}