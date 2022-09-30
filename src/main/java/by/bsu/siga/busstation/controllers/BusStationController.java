package by.bsu.siga.busstation.controllers;

import by.bsu.siga.busstation.db.MemoryDb;
import by.bsu.siga.busstation.entities.BusRoute;
import by.bsu.siga.busstation.entities.BusStation;
import by.bsu.siga.busstation.entities.Position;
import by.bsu.siga.busstation.entities.ScoreboardRoute;

public class BusStationController {
    public static BusStation getStation() {
        return MemoryDb.getBusStation();
    }

    public static BusRoute[] getAllRoutes() {
        return MemoryDb.getBusRoutes();
    }

    public static BusRoute[] getBusRoutes() {
        return MemoryDb.getStationBusRoutes();
    }

    public static BusRoute getBusRoute(String id) {
        if (id == null) {
            throw new RuntimeException("id param should be specified");
        }

        return MemoryDb.getBusRoute(id);
    }

    public static BusStation addRouteToStation(String id) throws RuntimeException {
        if (id == null) {
            throw new RuntimeException("id param should be specified");
        }

        BusRoute busRoute = MemoryDb.getBusRoute(id);

        if (busRoute == null) {
            throw new RuntimeException("route with specified id is not found");
        }

        return MemoryDb.addRouteToStation(id);
    }

    public static BusRoute updateRoute(String id, String direction) throws RuntimeException {
        if (id == null || direction == null) {
            throw new RuntimeException("id and direction should be specified");
        }

        BusRoute busRoute = MemoryDb.getBusRoute(id);

        if (busRoute == null) {
            throw new RuntimeException("route not found");
        }

        return MemoryDb.updateBusRoute(busRoute, direction);
    }

    public static boolean deleteRoute(String id) {
        if (id == null) {
            throw new RuntimeException("id param should be specified");
        }

        return MemoryDb.removeBusRouteFromStation(id);
    }

    public static Position getPosition() {
        return MemoryDb.getStationPosition();
    }

    public static BusStation updatePosition(String latitude, String longitude) {
        if (latitude == null || longitude == null) {
            throw new RuntimeException("latitude and longitude should be specified");
        }

        Position position = new Position(latitude, longitude);
        return MemoryDb.updateStationPosition(position);
    }

    public static ScoreboardRoute[] getScoreboard() {
        return MemoryDb.getScoreboard();
    }
}
