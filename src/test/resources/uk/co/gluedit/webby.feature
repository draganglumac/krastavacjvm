@web
Feature: Playground for Selenium and Page Objects.

  Scenario Outline: Selenium WebDriver and PageObjects "Hello world" - google search
    Given I open Google search
    When I search for <term>
    Then results will contain <result>
    Examples:
      | term  | result       |
      | Tesla | Elon Musk    |
