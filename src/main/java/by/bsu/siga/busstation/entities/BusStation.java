package by.bsu.siga.busstation.entities;

import java.util.ArrayList;

public class BusStation extends BaseEntity {
    private String name;
    private Position position;
    private ScoreboardRoute[] scoreboardRoutes;
    private final ArrayList<String> busRoutes;

    public BusStation(String name, Position position, ScoreboardRoute[] scoreboardRoutes, ArrayList<String> busRoutes) {
        this.name = name;
        this.position = position;
        this.scoreboardRoutes = scoreboardRoutes;
        this.busRoutes = busRoutes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public ScoreboardRoute[] getScoreboardRoutes() {
        return scoreboardRoutes;
    }

    public void setScoreboardRoutes(ScoreboardRoute[] scoreboardRoutes) {
        this.scoreboardRoutes = scoreboardRoutes;
    }

    public ArrayList<String> getBusRoutes() {
        return busRoutes;
    }
}
