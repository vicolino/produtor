package br.com.vj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.vj.service.FizzBuzzService;

@SpringBootApplication
@RestController
public class Application {

	private int counter = 0;
	
	@Autowired
	private FizzBuzzService service;

	@RequestMapping(value = "/produce", produces = "application/json")
	public String produce() {
		counter++;
		return "{\"value\":"+counter+"}";
	}

	@RequestMapping(value = "/reduce", produces = "application/json")
	public String reduces() {
		counter--;
		return "{\"value\":"+counter+"}";
	}

	@RequestMapping(value = "/fizzBuzz/{numero}")
	public String fizzBuzz(@PathVariable("numero") Integer numero) {
		return service.fizzBuzz(numero);
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}
}
