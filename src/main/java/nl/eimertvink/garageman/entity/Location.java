package nl.eimertvink.garageman.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class Location {

    @Getter
    private final String lat;
    @Getter
    private final String lng;
}
