package com.babiel.exercises.AddressBook;

/**
 * Created by p.okraku on 31.05.2019.
 */
import com.babiel.exercises.AddressBook.template.RestDemo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringBootWebApplication extends SpringBootServletInitializer {

  @Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
    return application.sources(SpringBootWebApplication.class);
  }

  public static void main(String[] args) {
    SpringApplication.run(SpringBootWebApplication.class, args);
    new RestDemo();
  }
}
