package nl.eimertvink.garageman.controller;

import lombok.AllArgsConstructor;
import nl.eimertvink.garageman.dto.CarDto;
import nl.eimertvink.garageman.entity.Warehouse;
import nl.eimertvink.garageman.repository.InventoryRepository;
import nl.eimertvink.garageman.util.Endpoints;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(Endpoints.Inventory)
@RestResource(rel = "warehouse", path = Endpoints.Inventory)
@AllArgsConstructor
public class InventoryController {

    private final InventoryRepository inventoryRepository;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Warehouse> findAll() {
        return inventoryRepository.findAll();
    }

    @RequestMapping(value = "/getById/{id}", method = RequestMethod.GET)
    public ResponseEntity<CarDto> getById(@PathVariable(value="id") final String id) {
        var warehouse = inventoryRepository.findAll().stream()
            .filter(x -> x.getCars().getCarById(id).isPresent())
            .findFirst();

        return warehouse.isPresent() ?
            new ResponseEntity<>(new CarDto(
                warehouse.get().getName(),
                warehouse.get().getLocation(),
                warehouse.get().getCars().getLocation(),
                warehouse.get().getCars().getCarById(id).orElse(null)), HttpStatus.OK) :
            new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }
}
