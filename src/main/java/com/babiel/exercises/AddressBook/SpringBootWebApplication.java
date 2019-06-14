package com.babiel.exercises.AddressBook;

/**
 * Created by p.okraku on 31.05.2019.
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringBootWebApplication extends SpringBootServletInitializer {

  @Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
    return application.sources(SpringBootWebApplication.class);
  }

  public static void main(String[] args) {
    SpringApplication.run(SpringBootWebApplication.class, args);
  }
}
