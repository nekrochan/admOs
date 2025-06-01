package org.example.controller;

import org.example.model.Car;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/cars")
public class CarController {

    @GetMapping
    public List<Car> getAllCars() {
        return Arrays.asList(
                new Car(1L, "Toyota Camry", 1L),
                new Car(2L, "Honda Civic", 2L)
        );
    }
}
