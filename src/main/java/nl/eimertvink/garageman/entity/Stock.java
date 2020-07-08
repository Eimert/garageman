package nl.eimertvink.garageman.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@AllArgsConstructor
@Document
public class Stock {

    @Getter
    private final String location;
    @Getter
    private final List<Car> vehicles;
}
