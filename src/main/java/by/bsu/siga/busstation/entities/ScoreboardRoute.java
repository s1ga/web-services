package by.bsu.siga.busstation.entities;

public class ScoreboardRoute {
    private String routeId;
    private int near;
    private int next;

    public ScoreboardRoute(String routeId, int near, int next) {
        this.routeId = routeId;
        this.near = near;
        this.next = next;
    }

    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    public int getNear() {
        return near;
    }

    public void setNear(int near) {
        this.near = near;
    }

    public int getNext() {
        return next;
    }

    public void setNext(int next) {
        this.next = next;
    }
}
