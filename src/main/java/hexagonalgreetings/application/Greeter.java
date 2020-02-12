package hexagonalgreetings.application;

import hexagonalgreetings.application.ports.in.GetRandomGreeting;
import hexagonalgreetings.application.ports.in.GetWorldGreeting;
import hexagonalgreetings.application.ports.out.RandomGreeter;
import hexagonalgreetings.domain.WorldGreeter;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class Greeter implements GetRandomGreeting, GetWorldGreeting {

  private RandomGreeter randomGreeter;

  public String randomGreeting() throws Exception {
    return randomGreeter.greet();
  }

  public String greetWorld() {
    return WorldGreeter.greet();
  }
}
