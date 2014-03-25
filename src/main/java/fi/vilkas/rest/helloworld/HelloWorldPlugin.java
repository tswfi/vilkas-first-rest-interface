package fi.vilkas.rest.helloworld;

import com.epages.plugin.AbstractPlugin;

public class HelloWorldPlugin extends AbstractPlugin {

	@Override
	protected void configure() {
		// bind to rest JaxRs stuff
		bindToJaxRs(HelloWorldResource.class);

	}

}
