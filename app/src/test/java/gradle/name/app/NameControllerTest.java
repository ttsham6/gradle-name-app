package gradle.name.app;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class NameControllerTest {

  @Test
  void getFullName(@Autowired MockMvc mvc) throws Exception {

    mvc.perform(
        get("/fullname")
            .param("firstName", "Taro")
            .param("lastName", "Yamada"))
        .andExpect(status().isOk());
  }
}
