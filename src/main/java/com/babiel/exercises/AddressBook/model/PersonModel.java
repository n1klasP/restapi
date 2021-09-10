package com.babiel.exercises.AddressBook.model;

import com.babiel.exercises.AddressBook.controller.Firstname;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

/**
 * Created by p.okraku on 31.05.2019.
 */
@Entity
@Table(name = "person")
public class PersonModel {

  @Id
  @GeneratedValue
  private long id;

  @Firstname(message = "{test}")
  private String firstName;

  @NotEmpty(message = "leer")
  private String lastName;

  @NotEmpty(message = "leer")
  private String street;

  @Min(value = 1, message = "leer")
  private int zipCode;

  @NotEmpty(message = "leer")
  private String city;


  public PersonModel() {
  }

  public PersonModel(long id, String firstName, String lastName, String street, int zipCode, String city) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.street = street;
    this.zipCode = zipCode;
    this.city = city;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public int getZipCode() {
    return zipCode;
  }

  public void setZipCode(int zipCode) {
    this.zipCode = zipCode;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }
}
