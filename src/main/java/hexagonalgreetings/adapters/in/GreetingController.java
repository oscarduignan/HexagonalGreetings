package hexagonalgreetings.adapters.in;

import hexagonalgreetings.application.ports.in.GetRandomGreeting;
import hexagonalgreetings.application.ports.in.GetWorldGreeting;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class GreetingController {

  private GetWorldGreeting getWorldGreeting;

  private GetRandomGreeting getRandomGreeting;

  @GetMapping("/")
  public String greetWorld() {
    return getWorldGreeting.greetWorld();
  }

  @GetMapping("/random-greeting/")
  public String randomGreeting() throws Exception {
    return getRandomGreeting.randomGreeting();
  }
}
