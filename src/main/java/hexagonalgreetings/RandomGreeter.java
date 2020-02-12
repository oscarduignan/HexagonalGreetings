package hexagonalgreetings;

import com.fasterxml.jackson.core.JsonProcessingException;

public interface RandomGreeter {
  public String greet() throws JsonProcessingException;
}
