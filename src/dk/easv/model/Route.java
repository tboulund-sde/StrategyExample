package dk.easv.model;

public class Route {
    private String[] waypoints;
    private int timeInMinutes;

    public Route(int timeInMinutes, String... waypoints) {
        this.timeInMinutes = timeInMinutes;
        this.waypoints = waypoints;
    }

    public String[] getWaypoints() {
        return waypoints;
    }
}
