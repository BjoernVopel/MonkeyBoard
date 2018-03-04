package org.monkey.monkeyboard.logic;

import javax.annotation.Resource;
import org.monkey.monkeyboard.connector.DbConnector;
import org.monkey.monkeyboard.entities.User;
import org.springframework.stereotype.Component;

@Component("UserLogic")
public class UserLogic {
    
    @Resource(name="DB")
    DbConnector db;
    
    public void createUser (String name, String password) {
        User user = new User();
        user.setUsername(name);
        user.setPassword(password);
        db.saveUser(user);
    }
}
