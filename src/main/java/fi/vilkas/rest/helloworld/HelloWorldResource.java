package fi.vilkas.rest.helloworld;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("v/hello-world")
public class HelloWorldResource {
	private final HelloWorldService service;

	@Inject
	public HelloWorldResource(HelloWorldService service) {
		this.service = service;
	}
	
	@GET
	@Produces(( MediaType.TEXT_PLAIN ))
	public String getHelloWorld() {
		return service.sayHelloWorld();
	}
}
