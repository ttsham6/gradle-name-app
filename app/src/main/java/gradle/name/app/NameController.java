package gradle.name.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {

  @GetMapping("/fullname")
  public String fullName(
          @RequestParam("firstName") String firstName,
          @RequestParam("lastName") String lastName
  ) {
    Name name = new Name(firstName, lastName);
    return name.fullName();
  }
}
