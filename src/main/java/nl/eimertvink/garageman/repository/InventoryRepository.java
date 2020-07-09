package nl.eimertvink.garageman.repository;

import nl.eimertvink.garageman.entity.Warehouse;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(exported = false) // Don't expose here: cannot set api path to /api/v1/inventory
public interface InventoryRepository extends MongoRepository<Warehouse, String> {

}
