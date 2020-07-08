package nl.eimertvink.garageman.repository;

import nl.eimertvink.garageman.entity.Warehouse;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//@Repository
//@RepositoryRestResource(collectionResourceRel = "inventory", path = "inventory")
@RepositoryRestResource(exported = false)
public interface InventoryRepository extends MongoRepository<Warehouse, String> {

}
