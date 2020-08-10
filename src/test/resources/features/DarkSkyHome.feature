@web

Feature: DarkSkyHomePage feature

  Background:
    Given I am on Dark Sky home page

  @DarkSkyHome
  Scenario: Verify the lowest and highest temp is displayed correctly
    When I click on Today button and expand it
    And I get lowest temperature, verify displayed temperature
    Then I get highest temperature, verify displayed temperature

