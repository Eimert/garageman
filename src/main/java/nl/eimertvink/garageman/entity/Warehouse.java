package nl.eimertvink.garageman.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@Document(collection = "inventory")
public class Warehouse extends AbstractEntity {

    @Getter
    private final String name;
    @Getter
    private final Location location;
    @Getter
    private final Stock cars;
}
