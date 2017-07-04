package br.com.vj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

  private int counter = 0;

  @RequestMapping(value = "/", produces = "application/json")
  public String produce() {
    counter++;
    return "{\"value\":"+counter+"}";
  }
	
  @RequestMapping(value = "/", reduces = "application/json")
  public String reduce() {
    counter--;
    return "{\"value\":"+counter+"}";
  }
  
  public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}
}
