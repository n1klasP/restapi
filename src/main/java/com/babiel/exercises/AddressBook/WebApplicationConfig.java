package com.babiel.exercises.AddressBook;

import com.babiel.exercises.AddressBook.persistence.DataSource;
import com.babiel.exercises.AddressBook.persistence.impl.DummyDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by p.okraku on 01.07.2019.
 */
@Configuration
public class WebApplicationConfig {
  @Bean
  public DataSource addressBookDataSource() {
    return new DummyDataSource();
  }
}
