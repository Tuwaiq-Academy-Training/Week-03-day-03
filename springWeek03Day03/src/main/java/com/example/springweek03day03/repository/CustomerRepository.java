package com.example.springweek03day03.repository;

import com.example.springweek03day03.model.oneToOne.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
