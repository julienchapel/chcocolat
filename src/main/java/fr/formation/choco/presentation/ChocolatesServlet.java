package fr.formation.choco.presentation;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ChocolatesServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		Writer writer = resp.getWriter();
		writer.append("<html>");
		writer.append("<body>");
		writer.append("<h1>Nos chocolats</h1>");
		writer.append("</body>");
		writer.append("</html>");
	}
}
