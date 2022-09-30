package by.bsu.siga.busstation.db;

import by.bsu.siga.busstation.entities.BusRoute;
import by.bsu.siga.busstation.entities.Position;
import by.bsu.siga.busstation.entities.ScoreboardRoute;
import by.bsu.siga.busstation.entities.BusStation;

import java.util.ArrayList;
import java.util.Arrays;

public class MemoryDb {
    private static final ArrayList<BusRoute> busRoutes = new ArrayList<>(Arrays.asList(
            new BusRoute("Direction 1", "Route 1"),
            new BusRoute("Direction 2", "Route 2"),
            new BusRoute("Direction 3", "Route 3"),
            new BusRoute("Direction 4", "Route 4"),
            new BusRoute("Direction 5", "Route 5"),
            new BusRoute("Direction 6", "Route 6"),
            new BusRoute("Direction 7", "Route 7"),
            new BusRoute("Direction 8", "Route 8")
    ));

    private static final ArrayList<String> stationBusRoutes = new ArrayList<>(Arrays.asList(
            busRoutes.get(0).getId(), busRoutes.get(5).getId()
    ));
    private static final ScoreboardRoute[] scoreboardRoutes = stationBusRoutes
            .stream()
            .map(id -> new ScoreboardRoute(id, 2, 10))
            .toArray(ScoreboardRoute[]::new);
    private static final Position position = new Position("53.9024716", "27.5618225");
    private static final BusStation busStation = new BusStation("Bus station", position, scoreboardRoutes, stationBusRoutes);

    public static BusStation getBusStation() {
        return busStation;
    }

    public static BusRoute[] getBusRoutes() {
        BusRoute[] routes = new BusRoute[busRoutes.size()];
        return busRoutes.toArray(routes);
    }

    public static BusRoute[] getStationBusRoutes() {
        return busStation
                .getBusRoutes()
                .stream()
                .map(MemoryDb::getBusRoute)
                .toArray(BusRoute[]::new);
    }

    public static BusRoute getBusRoute(String id) {
        return busRoutes
                .stream()
                .filter(busRoute -> busRoute.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public static BusStation addRouteToStation(String id) {
        busStation.getBusRoutes().add(id);
        return busStation;
    }

    public static BusRoute updateBusRoute(BusRoute busRoute, String direction) {
        return busRoute.update(direction);
    }

    public static boolean removeBusRouteFromStation(String id) {
        return busStation.getBusRoutes().remove(id);
    }

    public static Position getStationPosition() {
        return busStation.getPosition();
    }

    public static BusStation updateStationPosition(Position position) {
        busStation.setPosition(position);
        return busStation;
    }

    public static ScoreboardRoute[] getScoreboard() {
        return busStation.getScoreboardRoutes();
    }
}
