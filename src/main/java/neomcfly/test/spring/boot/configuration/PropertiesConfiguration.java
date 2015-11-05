package neomcfly.test.spring.boot.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySources(value = { @PropertySource(value = "classpath:app-config.yaml"),
		@PropertySource(value = "file:${appConfigDirectory}/app.properties", ignoreResourceNotFound = true),
		@PropertySource(value = "file:${appConfigFile}", ignoreResourceNotFound = true) })
public class PropertiesConfiguration {

}
