package com.hari.spring.brewery.web.services;

import com.hari.spring.brewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService{
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
                .name("Hari").uid(customerId).build();
    }

    @Override
    public CustomerDto handlePost(CustomerDto customerDto) {
        return CustomerDto.builder()
                .uid(UUID.randomUUID()).build();
    }

    @Override
    public void handlePut(UUID customerId, CustomerDto customerDto) {
      //todo impl
    }

    @Override
    public void handleDelete(UUID customerId) {
       log.debug("Delete Customer");
    }
}
