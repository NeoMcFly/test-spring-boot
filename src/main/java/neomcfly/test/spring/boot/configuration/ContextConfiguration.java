package neomcfly.test.spring.boot.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import neomcfly.test.spring.boot.Main;

@Configuration
@ComponentScan(basePackageClasses = Main.class)
public class ContextConfiguration {

}
