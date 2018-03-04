package org.monkey.monkeyboard.repositories;

import org.monkey.monkeyboard.entities.Route;
import org.springframework.data.repository.CrudRepository;

public interface RouteRepository extends CrudRepository<Route, Long>{

    Route findOneById(Long id);

	
	
}
