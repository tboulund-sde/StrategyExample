package dk.easv.bll.strategies;
import dk.easv.model.Route;

public interface IRouteStrategy {

    Route findRoute(String startingPoint, String destinationPoint);

}
