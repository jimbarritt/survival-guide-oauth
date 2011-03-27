Feature: Can freely access the Alice homepage
  Background: As a user I want to be able to freely access the homepage on Alice so that I can see what operations I can perform
  Scenario: Navigate to the home page
    Given The Alice server is running
    When I navigate to the home page
    Then I should see the welcome message
