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
                return new Route( startingPoint, "Skolegade", "Kirkegade", destinationPoint);
            }
            case Car -> {
                return new Route(startingPoint, "Skolegade", "Stormgade", destinationPoint);
            }
            case Bus -> {
                return new Route(startingPoint, "Havnegade", "Strandbygade", "Gl. Vardevej", destinationPoint);
            }
            default -> {
                return new Route();
            }
        }
    }

}

