package dk.easv.model;

public class Route {
    private String[] waypoints;

    public Route(String... waypoints) {
        this.waypoints = waypoints;
    }

    public String[] getWaypoints() {
        return waypoints;
    }
}
