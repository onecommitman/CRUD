package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

	@GetMapping("/first")
	public String helloPage(@RequestParam(value = "name", required = false) String name,
							@RequestParam(value = "surname", required = false) String surname,
							Model model) {
		//System.out.println("Hello, " + name + " " + surname + "!");
		model.addAttribute("message", "Hello, " + name + " " + surname);

		return "first/hello";
	}
	
}