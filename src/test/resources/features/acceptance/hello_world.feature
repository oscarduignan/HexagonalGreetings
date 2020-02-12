Feature: Random Greeting
  Because variety is the spice of life

  Scenario: Success with stub
    Given I setup a stub for random greeting of "Hello, World!"
    When I request a greeting
    Then I should receive "Hello, World!"