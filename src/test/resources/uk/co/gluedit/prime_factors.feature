Feature: Given an integer find its prime factorisation

  Scenario Outline: Only positive integers have prime factorisations
    Given I pass <example> to PrimeMux
    Then the result will be <result>
    Examples:
      | example | result        |
      | 0       | undefined     |
      | -1      | undefined     |
      | 1.3     | undefined     |
      | 1       | undefined     |
      | 2       | 2             |
      | 3       | 3             |
      | 4       | 2 * 2         |
      | 5       | 5             |
      | 6       | 2 * 3         |
      | 7       | 7             |
      | 8       | 2 * 2 * 2     |
      | 9       | 3 * 3         |
      | 10      | 2 * 5         |
      | 11      | 11            |
      | 12      | 2 * 2 * 3     |
      | 13      | 13            |
      | 14      | 2 * 7         |
      | 15      | 3 * 5         |
      | 16      | 2 * 2 * 2 * 2 |
      | 17      | 17            |
      | 18      | 2 * 3 * 3     |
      | 19      | 19            |
      | 20      | 2 * 2 * 5     |
      | 21      | 3 * 7         |
      | 22      | 2 * 11        |
