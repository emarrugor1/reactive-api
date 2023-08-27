package udc.edu.co.reactiveapi.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "udc.edu.co.reactiveapi")
public class ReactiveApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactiveApiApplication.class, args);
	}

}
