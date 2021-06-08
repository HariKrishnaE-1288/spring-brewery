package com.hari.spring.brewery.web.controller;

import com.hari.spring.brewery.web.model.CustomerDto;
import com.hari.spring.brewery.web.services.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Response;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService){
        this.customerService = customerService;
    }

    @GetMapping("/{customerId}")
    public ResponseEntity<CustomerDto> getCustomerById(@PathVariable("customerId") UUID customerId ){
        return new ResponseEntity<>(customerService.getCustomerById(customerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity handlePost(@RequestBody CustomerDto customerDto){

        return new ResponseEntity(customerService.handlePost(customerDto),HttpStatus.CREATED);
    }

    @PutMapping("/{customerId}")
    public ResponseEntity handlePut(@PathVariable("customerId") UUID customerId,@RequestBody CustomerDto customerDto){

        customerService.handlePut(customerId,customerDto);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{customerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void  handleDelete(@PathVariable("customerId") UUID customerId){
           customerService.handleDelete(customerId);
    }

}
