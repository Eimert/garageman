package nl.eimertvink.garageman.entity;

import org.springframework.data.annotation.Id;

public abstract class AbstractEntity {

    @Id
    public String id;
}
