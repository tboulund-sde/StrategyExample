package dk.easv.bll;

import dk.easv.bll.strategies.IRouteStrategy;
import dk.easv.model.Route;

public class NavigationSystem {

    private IRouteStrategy routeStrategy;

    public NavigationSystem(IRouteStrategy routeStrategy) {
        this.routeStrategy = routeStrategy;
    }

    public Route findRoute(String startingPoint, String destinationPoint) {
        return routeStrategy.findRoute(startingPoint, destinationPoint);
    }

    public void setRouteStrategy(IRouteStrategy routeStrategy) {
        this.routeStrategy = routeStrategy;
    }

}

