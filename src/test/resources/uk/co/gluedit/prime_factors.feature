Feature: Given an integer find its prime factorisation

  Scenario Outline: Only positive integers have prime factorisations
    Given I pass <example> to PrimeMux
    Then the result will be <result>
    Examples:
      | example | result                |
      | 0       | undefined             |
      | -1      | undefined             |
      | 1.3     | undefined             |
      | 1       | undefined             |
      | blah    | undefined             |
      | 25      | 5 * 5                 |
      | 144     | 2 * 2 * 2 * 2 * 3 * 3 |
      | 1234    | 2 * 617               |
      | 8192341 | 8192341               |
