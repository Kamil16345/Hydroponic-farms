package com.hydroponics.product_service.controller;

import com.hydroponics.product_service.product.Carrot;
import com.hydroponics.product_service.repository.CarrotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/carrot")
public class CarrotController {
    @Autowired
    private CarrotRepository carrotRepository;
    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public Carrot createCarrot(@RequestBody Carrot carrot) {
        return carrotRepository.save(carrot);
    }
}
