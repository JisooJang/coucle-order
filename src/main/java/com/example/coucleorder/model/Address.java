package com.example.coucleorder.model;

import com.example.coucleorder.enums.AddressType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address extends BaseEntity {
    private Long addressId;

    private String street1;

    private String street2;

    private String state;

    private String city;

    private String country;

    private Integer zipcode;

    private AddressType addressType;

    @Builder
    public Address(String street1, String street2, String state, String city, String country,
                   AddressType addressType, Integer zipcode) {
        this.street1 = street1;
        this.street2 = street2;
        this.state = state;
        this.city = city;
        this.country = country;
        this.addressType = addressType;
        this.zipcode = zipcode;
    }


}
