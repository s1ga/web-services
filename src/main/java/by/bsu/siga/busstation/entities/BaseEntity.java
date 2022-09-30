package by.bsu.siga.busstation.entities;

import java.util.UUID;

public class BaseEntity {
    private final String id;

    public BaseEntity() {
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }
}
