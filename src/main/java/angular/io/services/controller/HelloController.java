package angular.io.services.controller;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Component;

import angular.io.services.model.Hero;

@Component
@Path("/heroes")
public class HelloController {
	
	private static final List<Hero> HEROES = new ArrayList<Hero>() {
		{
			add(new Hero(11, "Mr Nice"));
			add(new Hero(12, "Narco"));
			add(new Hero(13, "Bombasto"));
			add(new Hero(14, "Celeritas"));
			add(new Hero(15, "Magneta"));
			add(new Hero(16, "RubberMan"));
			add(new Hero(17, "Dynama"));
			add(new Hero(18, "Dr IQ"));
			add(new Hero(19, "Magma"));
			add(new Hero(20, "Tornado"));
		}
	};
	
	@GET
	@Produces("application/json")
	public Response getHeroes() {
		return Response.ok()
				.entity(HEROES)
				.header("Access-Control-Allow-Origin", "*")
				.build();
	}
	
}
