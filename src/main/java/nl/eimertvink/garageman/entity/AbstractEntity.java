package nl.eimertvink.garageman.entity;

import lombok.Getter;
import org.springframework.data.annotation.Id;

@Getter
public abstract class AbstractEntity {

    @Id
    public String id;
}
