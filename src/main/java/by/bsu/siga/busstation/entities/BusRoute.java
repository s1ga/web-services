package by.bsu.siga.busstation.entities;

public class BusRoute extends BaseEntity {
    private String direction;
    private String name;

    public BusRoute(String direction, String name) {
        this.direction = direction;
        this.name = name;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BusRoute update(String direction) {
        this.setDirection(direction);
        return this;
    }
}
