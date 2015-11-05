package neomcfly.test.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {

		// AnnotationConfigApplicationContext ctx = new
		// AnnotationConfigApplicationContext();
		//
		// ctx.register(ConfigurationContext.class);
		// ctx.refresh();

		SpringApplication.run(Main.class, args);

	}

}
