package com.example.restapi.DemoRestApi.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Address {

    private String houseNo;

    private String streetName;

    private String city;

    private String state;

    private String country;

    private String pinCode;
}
