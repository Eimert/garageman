package nl.eimertvink.garageman.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Document
public class Stock {

    @Getter
    private final String location;
    @Getter
    private final List<Car> vehicles;

    public Optional<Car> getCarById(String id) {
        return vehicles.stream().filter(c -> c.getId().equals(id)).findFirst();
    }
}
