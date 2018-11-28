package fr.formation.choco.presentation;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Une classe fille de HttpServlet est capable de répondre à certaines requêtes
 * HTTP. <br />
 * Les requêtes HTTP qui déclanchent cette servlet sont définies par l'URL
 * pattern correspondant dans le web.xml. Pour utiliser HttpServlet, il faut
 * redéfinir la méthode doXXX(req, resp) correspondant à la méthode HTTP
 * utilisée (GET, POST, etc...).
 */
public class OriginsServlet extends HttpServlet {

	/**
	 * Attribut en rapport avec la serialisation et la déserialisation des
	 * objets. A revoir plus tard.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * La redéfinition de cette méthode permet de répondre à une requête HTTP
	 * GET dont l'URL correspond à OriginsServlet. Cette méthode va servir à
	 * préparer le code HTML qu'il faut envoyer dans la réponse au client.
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// Récupération d'un objet de type java.io.Writer qui permet d'écrire
		// dans un flux (et ici le flux est le contenu de la réponse HTTP au
		// client).
		Writer writer = resp.getWriter();
		writer.append("<html>");
		writer.append("<body>");
		writer.append("<h1>Nos origines</h1>");
		writer.append("</body>");
		writer.append("</html>");
	}
}
