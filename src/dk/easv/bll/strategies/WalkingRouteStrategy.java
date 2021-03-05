package dk.easv.bll.strategies;

import dk.easv.model.Route;

public class WalkingRouteStrategy implements IRouteStrategy {
    @Override
    public Route findRoute(String startingPoint, String destinationPoint) {
        return new Route( startingPoint, "Skolegade", "Kirkegade", destinationPoint);
    }
}
