package com.company.classes;

import lombok.Data;

@Data
public class Address {
    String city;
    String street;
    String buildingNumber;
    String apartmentNumber;

    long postCode;
    long floor;
}
