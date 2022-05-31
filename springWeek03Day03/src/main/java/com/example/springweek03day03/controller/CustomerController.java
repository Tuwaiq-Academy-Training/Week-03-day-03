package com.example.springweek03day03.controller;

import com.example.springweek03day03.DTO.Api;
import com.example.springweek03day03.DTO.CustomerDetailsDTO;
import com.example.springweek03day03.model.oneToOne.Customer;
import com.example.springweek03day03.model.oneToOne.CustomerDetails;
import com.example.springweek03day03.repository.CustomerDetailsRepository;
import com.example.springweek03day03.repository.CustomerRepository;
import com.example.springweek03day03.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/customer")
public class CustomerController {

    private final CustomerRepository customerRepository;
    private final CustomerDetailsRepository customerDetailsRepository;
    @GetMapping
    public ResponseEntity getCustomers(){
        return ResponseEntity.status(HttpStatus.OK).body(customerRepository.findAll());
    }
    @GetMapping("details")
    public ResponseEntity getCustomersDetails(){
        return ResponseEntity.status(HttpStatus.OK).body(customerDetailsRepository.findAll());
    }

    @PostMapping
    public ResponseEntity addCustomer(@RequestBody Customer customer){
        customerRepository.save(customer);
        return ResponseEntity.status(HttpStatus.CREATED).body(new Api("Customer added !",201));
    }

    @PostMapping("details")
    public ResponseEntity addCustomerDetails(@RequestBody CustomerDetailsDTO cd){
        Customer customer=customerRepository.findById(cd.getCustomerId()).get();
        CustomerDetails customerDetails=new CustomerDetails(
                null,cd.getPhoneNumber(),cd.getHeight(),cd.getAge(),customer);
        customer.setCustomerDetails(customerDetails);

        customerDetailsRepository.save(customerDetails);
        return ResponseEntity.status(HttpStatus.CREATED).body(new Api("Customer added !",201));
    }



}
