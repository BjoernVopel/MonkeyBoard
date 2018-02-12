package org.monkey.monkeyboard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/")
public class MainController {
	
	@Autowired
	private RouteRepository routeRepository;
	
	@GetMapping(path = "/")
	public String showFrontpage(Model model) {
		return "index";
	}
	
	@GetMapping(path="/add")
	public @ResponseBody String addNewRoute(@RequestParam String name, @RequestParam String grad, @RequestParam String griffe) {
		
		Route r = new Route();
		r.setName(name);
		r.setGrad(grad);
		r.setGriffe(griffe);
		routeRepository.save(r);
		return "Saved";
		
	}
	
	@GetMapping(path="/all")
	public @ResponseBody Iterable<Route> getAllRoutes() {
		return routeRepository.findAll();
	}
	
}
