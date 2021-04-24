package org.carsapi.CarsApi.car;

import lombok.Data;
import org.carsapi.CarsApi.person.Person;

import javax.persistence.*;

@Data
@Entity
public class Car {
    @Id
    @GeneratedValue
    private Long id;

    private String model;
    private String brand;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Person owner;
}
