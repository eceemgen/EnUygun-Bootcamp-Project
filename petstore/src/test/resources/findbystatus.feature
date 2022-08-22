Feature:
  @Findbystatus
  Scenario: Successfull Finding Pets by Status
    When User Finds Pets by Status request
    Then Finding Pets message should be "User found pets by status successfully"
    And Finding response status is 200