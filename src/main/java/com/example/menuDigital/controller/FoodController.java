package com.example.menuDigital.controller;

//import com.example.menuDigital.Food;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("food")
public class FoodController {
    @GetMapping
    public void getAll(){

//        Food food

    }
}
