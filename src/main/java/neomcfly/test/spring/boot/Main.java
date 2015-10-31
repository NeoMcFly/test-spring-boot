package neomcfly.test.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import neomcfly.test.spring.boot.configuration.ConfigurationContext;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

		ctx.register(ConfigurationContext.class);
		ctx.refresh();

		SpringApplication.run(Main.class, args);

		ctx.close();

	}

}
