package dk.easv;

import dk.easv.bll.NavigationSystem;
import dk.easv.bll.TransportMethod;
import dk.easv.model.Route;

public class Main {

    public static void main(String[] args) {
        String from = "Esbjerg City";
        String to = "Business Academy South West";

        NavigationSystem nav = new NavigationSystem(TransportMethod.Bus);
        Route busRoute = nav.findRoute(from, to);

        nav.setTransportMethod(TransportMethod.Car);
        Route carRoute = nav.findRoute(from, to);

        nav.setTransportMethod(TransportMethod.Walking);
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
