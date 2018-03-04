package org.monkey.monkeyboard.connector;

import org.monkey.monkeyboard.entities.Route;
import org.monkey.monkeyboard.entities.User;
import org.monkey.monkeyboard.repositories.RouteRepository;
import org.monkey.monkeyboard.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

@Component("DB")
public class DbConnector {
    
    @Autowired
    public RouteRepository routeRepository;
    
    @Autowired
    public UserRepository userRepository;
    
    public User findCurrentUser() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String userName = auth.getName(); //get logged in username  
        System.out.println("Username in DbConnector" + userName);
        
        return userRepository.findByUsername(userName);
    }
    
    public Iterable<Route> findAllRoutes(){
            return routeRepository.findAll();
        
    }
    
    public void saveRoute(Route route) {
        routeRepository.save(route);
    }
    
    public void saveUser(User user) {
        userRepository.save(user);
    }
    
    public Route findRoute(Long id) {
        return routeRepository.findOneById(id);
    }
    

}
