package com.example.springweek03day03.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor @NoArgsConstructor @Data
public class CustomerDetailsDTO {
    private Integer customerId;
    private String phoneNumber;
    private Integer height;
    private Integer age;
}
