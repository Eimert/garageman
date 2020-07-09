package nl.eimertvink.garageman.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import nl.eimertvink.garageman.entity.Car;
import nl.eimertvink.garageman.entity.Location;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CarDto {

    private String warehouseName;
    private Location warehouseLocation;
    private String stockLocation;
    private Car car;
}
