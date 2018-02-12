package org.monkey.monkeyboard;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="/")
public class MainController {
	
	@GetMapping(path = "/")
	public String showFrontpage(Model model) {
		return "index";
	}
	
}
