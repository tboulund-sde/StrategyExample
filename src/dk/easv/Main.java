package dk.easv;

import dk.easv.bll.NavigationSystem;
import dk.easv.bll.strategies.BusRouteStrategy;
import dk.easv.bll.strategies.CarRouteStrategy;
import dk.easv.bll.strategies.WalkingRouteStrategy;
import dk.easv.model.Route;

public class Main {

    public static void main(String[] args) {
        String from = "Esbjerg City";
        String to = "Business Academy South West";

        NavigationSystem nav = new NavigationSystem(new BusRouteStrategy());
        Route busRoute = nav.findRoute(from, to);

        nav.setRouteStrategy(new CarRouteStrategy());
        Route carRoute = nav.findRoute(from, to);

        nav.setRouteStrategy(new WalkingRouteStrategy());
        Route walkingRoute = nav.findRoute(from, to);

        printRoute("Bus", busRoute);
        printRoute("Car", carRoute);
        printRoute("Walking", walkingRoute);
    }

    private static void printRoute(String type, Route route) {
        System.out.println(type.toUpperCase() + " " + route.getTimeInMinutes() + " minutes");
        for(String waypoint : route.getWaypoints()) {
            System.out.println(" - " + waypoint);
        }
        System.out.println();
    }
}
