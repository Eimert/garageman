package nl.eimertvink.garageman.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
public class Inventory {

    @Getter
    private final String location;
    @Getter
    private final List<Car> vehicles;
}
