package dk.easv.bll.strategies;

import dk.easv.model.Route;

public class CarRouteStrategy implements IRouteStrategy {
    @Override
    public Route findRoute(String startingPoint, String destinationPoint) {
        return new Route(10, startingPoint, "Skolegade", "Stormgade", destinationPoint);
    }
}
