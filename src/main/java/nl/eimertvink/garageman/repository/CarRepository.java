package nl.eimertvink.garageman.repository;

import nl.eimertvink.garageman.entity.Car;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CarRepository extends MongoRepository<Car, String> {
}
