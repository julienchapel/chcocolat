package fr.formation.choco.presentation;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import fr.formation.choco.BlogConstants;
import fr.formation.choco.metier.ChocoService;
import fr.formation.choco.metier.ChocoType;

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
	public ModelAndView eshop(@RequestParam(required = false) Integer id) {
		ModelAndView mav = new ModelAndView("eshop");
		mav.addObject("chocoTypes", this.chocoService.getChocoTypes());
		if( id == null) {
			mav.addObject("chocoType", new ChocoType());
			mav.addObject("isEdit", true);
		} else {
			mav.addObject("isEdit", false);
			mav.addObject("chocoType", this.chocoService.readChocoType(id));
		
		}
		
		return mav;
	}

	@RequestMapping(path = "eshop", method = RequestMethod.POST)
	public String validateForm(@RequestParam(required = false) Integer id, ChocoType chocoType, RedirectAttributes attributes) {
		String message = null;
		// Si l'identifiant est null alors on peut effectuer la création, et si la création
		// renvoie vrai alors on met le message de succès, sinon on passe au else if suivant.
		if (chocoType.getId() == null && this.chocoService
				.addChocoType(chocoType.getLabel(), chocoType.getValue())) {
			message = "ChocoType bien ajouté !";
		} else if (chocoType.getId() != null && this.chocoService.updateChocoType(chocoType.getId(),
				chocoType.getLabel(), chocoType.getValue())) {
			message = "ChocoType bien modifié !";
		} else {
			message = "Erreur : ChocoType non ajouté ou non modifié...";
		}
		// Utilisation des attributs flash de redirection (pas visible dans
		// l'URL, contrairement aux attributs de redirection normaux).
		// Le message sera reçu par le nouveau paramètre "message" de la méthode
		// index (ciblée par la redirection).
		attributes.addFlashAttribute("message", message);
		// On change pour un type de retour String permettant de renvoyer
		// uniquement le nom de vue de redirection.
		return BlogConstants.REDIRECT_TO_ESHOP;
	}
	
	@RequestMapping("delete")
	public String delete(@RequestParam Integer id) {
		LOGGER.debug("Action suppression d'un ChocoType !");
		this.chocoService.deleteChocoType(id);
		// On change pour un type de retour String permettant de renvoyer
		// uniquement le nom de vue de redirection.
		return BlogConstants.REDIRECT_TO_ESHOP;
	}
	
	
}
