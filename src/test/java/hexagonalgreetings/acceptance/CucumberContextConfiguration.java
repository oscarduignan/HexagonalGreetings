package hexagonalgreetings.acceptance;

import hexagonalgreetings.Application;
import hexagonalgreetings.application.ports.out.RandomGreeter;
import io.cucumber.java.Before;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest(classes = {Application.class})
@AutoConfigureMockMvc
@MockBean(RandomGreeter.class) // this has to be here?
public class CucumberContextConfiguration {

  @Before
  public void setup_cucumber_spring_context() {
    // Dummy method so cucumber will recognize this class as glue
    // and use its context configuration.
  }
}
