package angular.io.services.jersey;

import org.glassfish.jersey.filter.LoggingFilter;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.spring.scope.RequestContextFilter;

public class JerseyConfig extends ResourceConfig {
	
	public JerseyConfig() {
		register(RequestContextFilter.class);
		packages("angular.io.services");
		register(LoggingFilter.class);
	}

}
