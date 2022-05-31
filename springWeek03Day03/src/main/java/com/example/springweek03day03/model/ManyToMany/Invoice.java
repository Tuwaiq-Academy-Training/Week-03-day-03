package com.example.springweek03day03.model.ManyToMany;

import com.example.springweek03day03.model.oneToOne.Customer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@AllArgsConstructor @NoArgsConstructor @Data
@Entity
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer amount;


    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Meal> meals;
}
