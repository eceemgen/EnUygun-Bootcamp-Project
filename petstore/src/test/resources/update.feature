Feature:
  @Update
  Scenario: Successfully Updating a Path
    When User Updates a path in the store with form data
    Then Returning message should be "User updated pet successfully"
    And Updating response status is 200