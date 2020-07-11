package com.example.coucleorder.model;

import com.example.coucleorder.enums.AddressType;
import com.example.coucleorder.enums.InvoiceStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Invoice extends BaseEntity {
    @Id
    private String invoiceId;

    private String customerId;

    private List<Order> orders = new ArrayList<>();

    private Address billingAddress;

    private InvoiceStatus invoiceStatus;

    public Invoice(String customerId, Address billingAddress) {
        this.customerId = customerId;
        this.billingAddress = billingAddress;
        this.billingAddress.setAddressType(AddressType.BILLING);
        this.invoiceStatus = InvoiceStatus.CREAETED;
    }

    public void addOrder(Order order) {
        order.setAccountNumber(this.customerId);
        orders.add(order);
    }
}
