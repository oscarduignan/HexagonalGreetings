package hexagonalgreetings.adapters.out;

import static java.util.Objects.requireNonNull;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import hexagonalgreetings.application.ports.out.RandomGreeter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RandomKanyeGreeter implements RandomGreeter {

  public String greet() throws JsonProcessingException {
    return (new ObjectMapper()
        .readTree(
            requireNonNull(new RestTemplate().getForObject("https://api.kanye.rest", String.class)))
        .path("quote")
        .asText());
  }
}
