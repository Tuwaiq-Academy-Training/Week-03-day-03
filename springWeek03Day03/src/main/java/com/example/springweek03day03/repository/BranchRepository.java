package com.example.springweek03day03.repository;

import com.example.springweek03day03.model.OneToMany.Branch;
import com.example.springweek03day03.model.oneToOne.CustomerDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BranchRepository extends JpaRepository<Branch,Integer> {
}
