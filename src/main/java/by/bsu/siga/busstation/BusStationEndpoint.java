package by.bsu.siga.busstation;

import by.bsu.siga.busstation.controllers.BusStationController;
import by.bsu.siga.busstation.entities.BusRoute;
import by.bsu.siga.busstation.entities.BusStation;
import by.bsu.siga.busstation.entities.Position;
import by.bsu.siga.busstation.entities.ScoreboardRoute;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public class BusStationEndpoint {
    /**
     * Return the information about bus station
     * @return an instance of BusStation
     */
    @WebMethod
    public BusStation getStation() {
        return BusStationController.getStation();
    }

    /**
     * Return the list of all routes
     * @return an array of BusRoute
     */
    @WebMethod
    public BusRoute[] getAllRoutes() {
        return BusStationController.getAllRoutes();
    }

    /**
     * Return the list of routes for bus station
     * @return an array of BusRoute
     */
    @WebMethod
    public BusRoute[] getRoutes() {
        return BusStationController.getBusRoutes();
    }

    /**
     * Return the route by id
     * @param id route id
     * @throws RuntimeException if the id is not specified
     * @return an instance of BusRoute, if present
     */
    @WebMethod
    public BusRoute getRoute(@WebParam(name = "id") String id) {
        return BusStationController.getBusRoute(id);
    }

    /**
     * Add route to bus station routes list
     * @param id route id
     * @throws RuntimeException if the id is not specified
     * @return an instance of BusRoute, if present
     */
    @WebMethod
    public BusStation addRouteToStation(@WebParam(name = "id") String id) {
        return BusStationController.addRouteToStation(id);
    }

    /**
     * Update the route direction
     * @param id route id
     * @param direction new direction of route
     * @throws RuntimeException if the id or direction is not specified
     * @return an instance of BusRoute, if present
     */
    @WebMethod
    public BusRoute updateRoute(@WebParam(name = "id") String id,
                                @WebParam(name = "direction") String direction) {
        return BusStationController.updateRoute(id, direction);
    }

    /**
     * Delete the route by id
     * @param id route id
     * @throws RuntimeException if the id is not specified
     * @return true if route have been deleted as a result of the call
     */
    @WebMethod
    public boolean deleteRoute(@WebParam(name = "id") String id) {
        return BusStationController.deleteRoute(id);
    }

    /**
     * Return bus station coordinates
     * @return an instance of Position
     */
    @WebMethod
    public Position getPosition() {
        return BusStationController.getPosition();
    }

    /**
     * Update bus station position
     * @param latitude latitude
     * @param longitude longitude
     * @throws RuntimeException if the latitude or longitude is not specified
     * @return an instance of BusStation
     */
    @WebMethod
    public BusStation updatePosition(@WebParam(name = "latitude") String latitude,
                                     @WebParam(name = "longitude") String longitude) {
        return BusStationController.updatePosition(latitude, longitude);
    }

    /**
     * Return actual scoreboard for the station
     * @return an array of ScoreboardRoute
     */
    @WebMethod
    public ScoreboardRoute[] getScoreboard() {
        return BusStationController.getScoreboard();
    }
}
