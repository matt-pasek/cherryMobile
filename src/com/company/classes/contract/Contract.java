package com.company.classes.contract;

import com.company.classes.Service;
import com.company.classes.Tariff;
import lombok.Data;

import java.util.List;

@Data
public class Contract {
    long msisdn;

    List<Tariff> tariffs;
    List<Service> services;
}
