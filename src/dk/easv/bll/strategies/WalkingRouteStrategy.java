package dk.easv.bll.strategies;

import dk.easv.model.Route;

public class WalkingRouteStrategy implements IRouteStrategy {
    @Override
    public Route findRoute(String startingPoint, String destinationPoint) {
        return new Route(30, startingPoint, "Skolegade", "Kirkegade", destinationPoint);
    }
}
