package nl.eimertvink.garageman.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Car extends AbstractEntity {

    // issue with Lombok's @AllArgsConstructor? I don't see the constructor with the id inherited from the (abstract) superclass.

    private String make;

    private String model;

    private Integer year_model;

    private Double price;

    private Boolean licensed;

    private String date_added;

}
