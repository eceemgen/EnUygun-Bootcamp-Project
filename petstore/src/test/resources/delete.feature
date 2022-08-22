
Feature:
  @Delete
  Scenario: Successfully Deleting a Pet
    When User Deletes a Pet
    Then Delete message should be "User deletes the Pet successfully"
    And Deleting response status is 200