package hexagonalgreetings.adapters.in;

import hexagonalgreetings.application.ports.out.RandomGreeter;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class GreetingController {

  private RandomGreeter randomGreeter;

  @GetMapping("/random-greeting/")
  public String greeting() throws Exception {
    return randomGreeter.greet();
  }
}
