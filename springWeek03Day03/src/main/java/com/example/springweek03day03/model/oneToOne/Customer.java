package com.example.springweek03day03.model.oneToOne;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor @NoArgsConstructor @Entity
@Getter @Setter
public class Customer {
    @Id
    private Integer id;
    private String name;

    @OneToOne(mappedBy = "customer",cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private CustomerDetails customerDetails;
}
