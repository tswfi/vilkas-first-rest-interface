package fi.vilkas.rest.helloworld;

import javax.inject.Singleton;

import com.epages.plugin.AbstractPlugin;

public class HelloWorldPlugin extends AbstractPlugin {

	@Override
	protected void configure() {
		// bind to rest JaxRs stuff
		bindToJaxRs(HelloWorldResource.class);
//		bind(HelloWorldService.class).to(HelloWorldServiceImpl.class).in(Singleton.class);
		bind(HelloWorldService.class).to(HelloWorldServiceImpl2.class).in(Singleton.class);
	}

}
