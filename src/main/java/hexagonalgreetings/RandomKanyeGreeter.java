package hexagonalgreetings;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import static java.util.Objects.requireNonNull;

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
