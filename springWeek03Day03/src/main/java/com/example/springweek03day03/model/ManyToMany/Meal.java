package com.example.springweek03day03.model.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@AllArgsConstructor @NoArgsConstructor
@Entity
@Getter
@Setter
public class Meal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @ManyToMany(mappedBy = "meals",cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Invoice> invoices;
}
