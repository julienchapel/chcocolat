package fr.formation.choco.presentation;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import fr.formation.choco.metier.ChocoService;
import fr.formation.choco.metier.ChocoType;

public class EshopServlet extends HttpServlet {
	
	private static final Logger LOGGER = Logger.getLogger(EshopServlet.class);

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// Accès service -> persistence -> données.
		List<ChocoType> list = ChocoService.getInstance().getData().getChocoTypes();
		req.setAttribute("chocoTypes", list);
		// Le RequestDispatcher et le seul objet permettant d'utiliser une page
		// JSP : Compiler et éxécuter le code Java puis transformer le tout en
		// HTML/CSS.
		// C'est toujours le contexte de la servlet (ServletContext)
		// qui permet de constuire un objet RequestDispatcher pour une JSP
		// donnée (ici /eshop.jsp).
		this.getServletContext().getRequestDispatcher("/eshop.jsp").forward(req,
				resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String name = req.getParameter("name");
		String address = req.getParameter("address");
		String choco = req.getParameter("choco");
		String message = String.format(
				"Un colis au nom de %s, à l'adresse %s avec du chocolat %s",
				name, address, choco);
		EshopServlet.LOGGER.info(message);
		// Passer une information de la Servlet à la JSP.
		req.setAttribute("message", message);
		// Rappel de doGet pour déclencher le forward vers la JSP.
		this.doGet(req, resp);
	}
}
