package com.example.springweek03day03.model.OneToMany;

import com.example.springweek03day03.model.ManyToMany.Invoice;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;
import java.util.Set;

@AllArgsConstructor @NoArgsConstructor @Entity
@Getter @Setter
public class Merchant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @OneToMany(mappedBy = "merchant",cascade = CascadeType.ALL)
    private Set<Branch> branches;
}
