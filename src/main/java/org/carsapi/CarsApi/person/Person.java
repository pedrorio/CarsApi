package org.carsapi.CarsApi.person;

import lombok.Data;
import org.carsapi.CarsApi.car.Car;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Person {
    @Id
    @GeneratedValue
    private Long id;

    @OneToMany(mappedBy = "owner")
    private List<Car> employees = new ArrayList<>();

}
