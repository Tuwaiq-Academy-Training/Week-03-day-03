package com.example.springweek03day03.controller;

import com.example.springweek03day03.DTO.Api;
import com.example.springweek03day03.DTO.BranchDTO;
import com.example.springweek03day03.model.OneToMany.Branch;
import com.example.springweek03day03.model.OneToMany.Merchant;
import com.example.springweek03day03.repository.BranchRepository;
import com.example.springweek03day03.repository.MerchantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashSet;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/merchant")
public class MerchantController {

    private final MerchantRepository merchantRepository;
    @GetMapping
    public ResponseEntity getMerchants(){
        return ResponseEntity.status(HttpStatus.OK).body(merchantRepository.findAll());
    }


    @PostMapping
    public ResponseEntity addMerchant(@RequestBody @Valid Merchant merchant){
        merchantRepository.save(merchant);
        return ResponseEntity.status(HttpStatus.CREATED).body(new Api("Customer added !",201));
    }


}
