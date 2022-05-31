package com.example.springweek03day03.controller;

import com.example.springweek03day03.DTO.Api;
import com.example.springweek03day03.model.ManyToMany.Meal;
import com.example.springweek03day03.repository.MealRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/meal")
public class MealController {

    private final MealRepository mealRepository;
    @GetMapping
    public ResponseEntity getMeal(){
        return ResponseEntity.status(HttpStatus.OK).body(mealRepository.findAll());
    }

    @PostMapping
    public ResponseEntity addMeal(@RequestBody @Valid Meal meal){
        mealRepository.save(meal);
        return ResponseEntity.status(HttpStatus.CREATED).body(new Api("Meal added !",201));
    }
}
