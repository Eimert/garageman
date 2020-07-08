package nl.eimertvink.garageman.controller;

import lombok.AllArgsConstructor;
import nl.eimertvink.garageman.entity.Warehouse;
import nl.eimertvink.garageman.repository.InventoryRepository;
import nl.eimertvink.garageman.util.Endpoints;
import org.springframework.data.rest.core.annotation.RestResource;
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
}
