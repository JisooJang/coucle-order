package com.example.coucleorder.repository;

import com.example.coucleorder.model.Address;
import com.example.coucleorder.model.Invoice;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface InvoiceRepository extends PagingAndSortingRepository<Invoice, String> {
    Invoice findByBillingAddress(Address address);
}
