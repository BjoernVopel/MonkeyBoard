package org.monkey.monkeyboard.logic;

import javax.annotation.Resource;
import org.monkey.monkeyboard.connector.DbConnector;
import org.monkey.monkeyboard.entities.Route;
import org.monkey.monkeyboard.entities.User;
import org.springframework.stereotype.Component;

@Component("RouteLogic")
public class RouteLogic {
    
    @Resource(name="DB")
    DbConnector db;
    
    public Iterable<Route> findAllRoutes(){
        return db.findAllRoutes();
    }
    
    public void createRoute (String name, String grad, String griffe) {
        User currentUser = db.findCurrentUser();
        System.out.println("RouteLogic current User");
        System.out.println(currentUser.getUsername());
        Route r = new Route();
        r.setName(name);
        r.setGrad(grad);
        r.setGriffe(griffe);
        r.setUser(currentUser);
        db.saveRoute(r);
    }
    
    public Route getRouteById(Long id) {
        return db.findRoute(id);
    }

}
