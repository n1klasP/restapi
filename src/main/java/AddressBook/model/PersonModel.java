package AddressBook.model;

/**
 * Created by p.okraku on 31.05.2019.
 */
public class PersonModel {
  private String id;
  private String firstName;
  private String lastName;
  private String street;
  private int zipCode;
  private String city;

  public PersonModel() {
  }

  public PersonModel(String id, String firstName, String lastName, String street, int zipCode, String city) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.street = street;
    this.zipCode = zipCode;
    this.city = city;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
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
