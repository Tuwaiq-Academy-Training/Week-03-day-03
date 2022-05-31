package com.example.springweek03day03.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor @NoArgsConstructor @Data
public class BranchDTO {
    private Integer merchantId;
    private Integer id;
    private String name;
}
