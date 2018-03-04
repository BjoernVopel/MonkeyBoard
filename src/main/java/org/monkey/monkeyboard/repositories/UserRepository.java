package org.monkey.monkeyboard.repositories;

import org.monkey.monkeyboard.entities.User;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<User, Long>{
	User findByUsername(String username);
}
