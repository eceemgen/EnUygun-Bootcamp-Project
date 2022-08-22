Feature:
  @FindbyID
  Scenario: Successfull Finding Pets by ID
    When User Finds Pets by ID request
    Then Finding Pets message should be "User found pets by ID successfully"
    And Finding response status is 200