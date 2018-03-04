package org.monkey.monkeyboard.controller;

import javax.annotation.Resource;
import org.monkey.monkeyboard.entities.Route;
import org.monkey.monkeyboard.entities.User;
import org.monkey.monkeyboard.logic.RouteLogic;
import org.monkey.monkeyboard.logic.UserLogic;
import org.monkey.monkeyboard.repositories.RouteRepository;
import org.monkey.monkeyboard.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.RedirectView;




@Controller
@RequestMapping(path="/")
public class MainController {
    
    @Resource(name="RouteLogic")
    RouteLogic routeLogic;
    
    @Resource(name="UserLogic")
    UserLogic UserLogic;
	
	@Autowired
	private RouteRepository routeRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping(path = "/")
	public String showStartpage(Model model) {
		return "index";
	}
	
	@GetMapping(path = "/authorized/test")
    public String testmethod(Model model) {
        return "index1";
    }
	
	@GetMapping(path = "/authorized/front")
	public String showFrontpage(Model model) {
		model.addAttribute("routen", routeLogic.findAllRoutes());
		return "index1";
	}
	
	@GetMapping(path = "/authorized/routeCreator")
	public String routeCreator() {
	    return "routeCreator";
	}
		
	@PostMapping(path="/authorized/createroute")
	public @ResponseBody RedirectView addNewRoute(@RequestParam String name, @RequestParam String grad, @RequestParam String griffe) {
	    routeLogic.createRoute(name, grad, griffe);
		return new RedirectView("/authorized/front");
	}
	
	@PostMapping(path="/createuser")
	public @ResponseBody RedirectView addNewUser(@RequestParam String name, @RequestParam String password) {
	    UserLogic.createUser(name, password);
		return new RedirectView("/authorized/front");
	}
	
	@PostMapping(path="/olduser")
	public @ResponseBody RedirectView oldUser() {
		return new RedirectView("/authorized/front");
	}
	
	@PostMapping(path="/authorized/showRoute")
	public String showRoute(Model model, @RequestParam Long id) {
	    Route route = routeLogic.getRouteById(id);
	    model.addAttribute("name",route.getName());
	    return "routenAnsicht";
	}
	
}
