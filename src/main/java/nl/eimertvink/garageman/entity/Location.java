package nl.eimertvink.garageman.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@Document
public class Location {

    @Getter
    private final String lat;
    @Getter
    private final String lng;
}
