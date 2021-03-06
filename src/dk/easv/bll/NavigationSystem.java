package dk.easv.bll;

import dk.easv.model.Route;

public class NavigationSystem {

    private TransportMethod transportMethod;

    public NavigationSystem(TransportMethod transportMethod) {
        this.transportMethod = transportMethod;
    }

    public Route findRoute(String startingPoint, String destinationPoint) {
        switch (transportMethod) {
            case Walking -> {
                return findWalkingRoute(startingPoint, destinationPoint);
            }
            case Car -> {
                return findCarRoute(startingPoint, destinationPoint);
            }
            case Bus -> {
                return findBusRoute(startingPoint, destinationPoint);
            }
            default -> {
                return null;
            }
        }
    }

    private Route findCarRoute(String startingPoint, String destinationPoint) {
        return new Route(10, startingPoint, "Skolegade", "Stormgade", destinationPoint);
    }

    private Route findBusRoute(String startingPoint, String destinationPoint) {
        return new Route(15,startingPoint, "Havnegade", "Strandbygade", "Gl. Vardevej", destinationPoint);
    }

    private Route findWalkingRoute(String startingPoint, String destinationPoint) {
        return new Route(30, startingPoint, "Skolegade", "Kirkegade", destinationPoint);
    }

    public void setTransportMethod(TransportMethod method) {
        transportMethod = method;
    }

}

