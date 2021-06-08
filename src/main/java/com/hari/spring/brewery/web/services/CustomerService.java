package com.hari.spring.brewery.web.services;

import com.hari.spring.brewery.web.model.CustomerDto;
import org.springframework.http.ResponseEntity;

import java.util.UUID;

public interface CustomerService {

    public CustomerDto getCustomerById(UUID customerId);

    CustomerDto handlePost(CustomerDto customerDto);

    void handlePut(UUID customerId, CustomerDto customerDto);

    void handleDelete(UUID customerId);
}
