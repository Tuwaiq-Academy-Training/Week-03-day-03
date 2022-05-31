package com.example.springweek03day03.model.OneToMany;

import com.example.springweek03day03.model.ManyToMany.Invoice;
import com.example.springweek03day03.model.oneToOne.CustomerDetails;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;
import java.util.Set;

@AllArgsConstructor @NoArgsConstructor @Data
@Entity
public class Branch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @ManyToOne
    @JsonIgnore
    private Merchant merchant;
}
