package com.example.springweek03day03.repository;

import com.example.springweek03day03.model.OneToMany.Merchant;
import com.example.springweek03day03.model.oneToOne.CustomerDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MerchantRepository extends JpaRepository<Merchant,Integer> {
}
