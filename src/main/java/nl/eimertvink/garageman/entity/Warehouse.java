package nl.eimertvink.garageman.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class Warehouse extends AbstractEntity {

    @Getter
    private final String name;
    @Getter
    private final Location location;
    @Getter
    private final Inventory cars;
}
