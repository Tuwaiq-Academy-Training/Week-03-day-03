package com.example.springweek03day03.controller;

import com.example.springweek03day03.DTO.Api;
import com.example.springweek03day03.DTO.BranchDTO;
import com.example.springweek03day03.DTO.CustomerDetailsDTO;
import com.example.springweek03day03.model.OneToMany.Branch;
import com.example.springweek03day03.model.OneToMany.Merchant;
import com.example.springweek03day03.model.oneToOne.Customer;
import com.example.springweek03day03.model.oneToOne.CustomerDetails;
import com.example.springweek03day03.repository.BranchRepository;
import com.example.springweek03day03.repository.CustomerDetailsRepository;
import com.example.springweek03day03.repository.MerchantRepository;
import com.example.springweek03day03.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/branch")
public class BranchController {

    private final BranchRepository branchRepository;
    private final MerchantRepository merchantRepository;
    @GetMapping
    public ResponseEntity getBranches(){
        return ResponseEntity.status(HttpStatus.OK).body(branchRepository.findAll());
    }


    @PostMapping
    public ResponseEntity addBranch(@RequestBody @Valid BranchDTO branchDTO){
        Merchant merchant= merchantRepository.findById(branchDTO.getMerchantId()).get();
        Branch branch=new Branch(branchDTO.getId(),branchDTO.getName(),merchant);
        merchant.getBranches().add(branch);
        branchRepository.save(branch);
        //merchantRepository.save(merchant);
        return ResponseEntity.status(HttpStatus.CREATED).body(new Api("Branch added !",201));
    }


}
