package com.example.coucleorder.model;

import com.example.coucleorder.enums.AddressType;
import com.example.coucleorder.enums.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Order extends BaseEntity {
    @Id
    private String orderId;

    private String accountNumber;

    private OrderStatus orderStatus;

    private List<LineItem> lineItems = new ArrayList<>();

    private Address shippineAddress;

    public Order(String accountNumber, Address shippineAddress) {
        this.accountNumber = accountNumber;
        this.shippineAddress = shippineAddress;
        this.shippineAddress.setAddressType(AddressType.SHIPPING);
        this.orderStatus = OrderStatus.PENDING;
    }
}
