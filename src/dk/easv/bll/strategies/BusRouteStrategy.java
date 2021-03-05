package dk.easv.bll.strategies;

import dk.easv.model.Route;

public class BusRouteStrategy implements IRouteStrategy {
    @Override
    public Route findRoute(String startingPoint, String destinationPoint) {
        return new Route(startingPoint, "Havnegade", "Strandbygade", "Gl. Vardevej", destinationPoint);
    }
}
