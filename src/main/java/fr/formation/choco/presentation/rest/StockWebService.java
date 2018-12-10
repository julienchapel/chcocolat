package fr.formation.choco.presentation.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import fr.formation.choco.metier.StockService;

@Path("/stock")
public class StockWebService {

	@GET
	public Response list() {
		return Response.ok(StockService.getInstance().getChocoStocks().toString()).build();
	}
	
	@GET
	@Path("/{id}")
	public Response read(@PathParam("id") Integer id) {
		return Response.ok(StockService.getInstance().getChocoStock(id).toString()).build();
	}
}
