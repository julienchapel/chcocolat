package fr.formation.choco.presentation;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import fr.formation.choco.metier.ChocoService;

@Controller
@RequestMapping("/")
public class ViewController {

	private static final Logger LOGGER = Logger.getLogger(ViewController.class);

	@Autowired
	private ChocoService chocoService;
	
	@RequestMapping({ "", "index"})
	public ModelAndView index() {
		return new ModelAndView("index");
	}

	@RequestMapping("origins")
	public ModelAndView origins() {
		return new ModelAndView("origins");
	}
	
	@RequestMapping("chocolates")
	public ModelAndView chocolates() {
		return new ModelAndView("chocolates");
	}

	@RequestMapping("visit")
	public ModelAndView visit() {
		return new ModelAndView("visit");
	}

	@RequestMapping("eshop")
	public ModelAndView eshop() {
		ModelAndView mav = new ModelAndView("eshop");
		mav.addObject("chocoTypes", this.chocoService.getChocoTypes());
		return mav;
	}

	@RequestMapping(path = "eshop", method = RequestMethod.POST)
	public ModelAndView eshopForm(String name, String address, String choco) {
		ModelAndView mav = new ModelAndView("eshop");
		String message = String.format(
				"Un colis au nom de %s, <C3><A0> l'adresse %s "
				+ "avec du chocolat %s",
				name, address, choco);
		LOGGER.info(message);
		mav.addObject("message", message);
		return mav;
	}
}
