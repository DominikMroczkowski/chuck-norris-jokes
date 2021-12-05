package dominikmroczkowski.chucknorrisjokes.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import dominikmroczkowski.chucknorrisjokes.services.JokesService;

@Controller
@RequestMapping("/")
class JokesController {
	public JokesController(JokesService jokes) {
		this.jokes = jokes;
	}

	private final JokesService jokes;

	@RequestMapping("")
	public String getJoke(Model model) {
		model.addAttribute("joke", jokes.getJoke());
		return "jokes/view";
	}
}
