package dk.easv;

import dk.easv.bll.NavigationSystem;
import dk.easv.bll.TransportMethod;

public class Main {

    public static void main(String[] args) {
        NavigationSystem nav = new NavigationSystem(TransportMethod.Bus);
        for(String waypoint : nav.findRoute("Esbjerg City", "Business Academy South West").getWaypoints()) {
            System.out.println(waypoint);
        }
    }
}
