package hexagonalgreetings.acceptance.stepdefs;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import hexagonalgreetings.RandomGreeter;

public class StepDefinitions {

  @Autowired private MockMvc mockMvc;

  @Autowired private RandomGreeter randomGreeter;

  private ResultActions resultActions;

  @Given("I setup a stub for random greeting of {string}")
  public void i_have_setup_a_stub_for_random_greeting_of(String stubGreeting) throws Exception {
    given(randomGreeter.greet()).willReturn(stubGreeting);
  }

  @When("I request a greeting")
  public void i_request_a_greeting() throws Exception {
    resultActions = mockMvc.perform(get("/random-greeting/")).andExpect(status().isOk());
  }

  @Then("I should receive {string}")
  public void i_should_receive(String greeting) throws Exception {
    resultActions.andExpect(content().string(greeting));
  }
}
