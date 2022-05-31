package com.example.springweek03day03.model.oneToOne;

import com.example.springweek03day03.model.oneToOne.Customer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

@AllArgsConstructor @NoArgsConstructor
@Entity
@Getter @Setter

public class CustomerDetails {
    @Id
    private Integer id;
    private String phoneNumber;
    private Integer height;
    private Integer age;

    @OneToOne(cascade  = CascadeType.ALL)
    @MapsId
    @JoinColumn(name = "customer_id")
    @JsonIgnore
    private Customer customer;
}
