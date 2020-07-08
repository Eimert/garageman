package nl.eimertvink.garageman.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@AllArgsConstructor
public class Car extends AbstractEntity {

    @Getter
    private final String make;
    @Getter
    private final String model;
    @Getter
    private final Integer year_model;
    @Getter
    private final Double price;
    @Getter
    private final Boolean licensed;
    @Getter
    private final LocalDate date_added;

}
