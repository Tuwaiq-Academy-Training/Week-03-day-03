package com.example.springweek03day03.repository;

import com.example.springweek03day03.model.ManyToMany.Meal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MealRepository extends JpaRepository<Meal,Integer> {
}
