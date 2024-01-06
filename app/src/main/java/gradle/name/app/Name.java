package gradle.name.app;

import lombok.Data;

@Data
public class Name {
  public Name(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  private String firstName;

  private String lastName;

  public String fullName() {
    return this.firstName + " " + this.lastName;
  }
}
