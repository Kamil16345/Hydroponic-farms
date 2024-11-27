package com.hydroponics.product_service.controller;

import com.hydroponics.product_service.product.Carrot;
import com.hydroponics.product_service.repository.CarrotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/carrots")
public class CarrotController {
    @Autowired
    private CarrotRepository carrotRepository;

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Carrot> getCarrot(@PathVariable UUID id) {
        return carrotRepository.findById(id);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Carrot> getAllCarrots() {
        return carrotRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Carrot createCarrot(@RequestBody Carrot carrot) {
        return carrotRepository.save(carrot);
    }
}
