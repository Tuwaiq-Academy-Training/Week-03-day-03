package com.example.springweek03day03.controller;

import com.example.springweek03day03.DTO.Api;
import com.example.springweek03day03.DTO.InvoiceDTO;
import com.example.springweek03day03.model.oneToOne.Customer;
import com.example.springweek03day03.model.ManyToMany.Invoice;
import com.example.springweek03day03.repository.CustomerRepository;
import com.example.springweek03day03.repository.InvoiceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/invoice")
public class InvoiceController {

    private final InvoiceRepository invoiceRepository;
    private final CustomerRepository customerRepository;
    @GetMapping
    public ResponseEntity getInvoice(){
        return ResponseEntity.status(HttpStatus.OK).body(invoiceRepository.findAll());
    }

    @PostMapping
    public ResponseEntity addInvoice(@RequestBody @Valid Invoice invoice){
        invoiceRepository.save(invoice);
        return ResponseEntity.status(HttpStatus.CREATED).body(new Api("Invoice added !",201));
    }
}
