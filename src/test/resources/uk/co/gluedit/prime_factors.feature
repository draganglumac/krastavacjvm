Feature: Given an integer find its prime factorisation

  Scenario Outline: Only positive integers have prime factorisations
    Given I pass <example> to PrimeMux
    Then the result will be <result>
    Examples:
      | example | result    |
      | 0       | undefined |
      | -1      | undefined |
      | 1.3     | undefined |
      | 1       | 1         |
      | 2       | 2         |
      | 3       | 3         |
