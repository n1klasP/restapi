package AddressBook.model;

/**
 * Created by p.okraku on 03.06.2019.
 */
public class GreetingModel {
  private String firstName;
  private String lastName;

  public GreetingModel() {
  }

  public GreetingModel(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
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
}
