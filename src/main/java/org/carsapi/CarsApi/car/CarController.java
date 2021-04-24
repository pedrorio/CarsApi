package org.carsapi.CarsApi.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityNotFoundException;

@RestController
@RequestMapping("/cars")
public class CarController {
    @Autowired
    private CarRepository carRepository;

    @GetMapping("/{carId}")
    public Car getCar(@PathVariable("carId") Long carId) {
        return carRepository
                .findById(carId)
                .orElseThrow(
                        () -> new EntityNotFoundException(carId.toString())
                );
    }
}
