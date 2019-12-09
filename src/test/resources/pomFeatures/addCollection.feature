@regression @add-collection
Feature: Add Collection

  @add-search-result
  Scenario: Add search result picture into new Collection.
    Given the user is on the main page pom
    And the user goes to Login Page
    And the user logs in "Thach Hoang" credential pom
    When he searches pics with keyword "Cute Puppies" pom
    And he adds the first image into new collection name "Thach's Puppies" pom
    And And he navigates to his collection page
    Then he can see the new collection is added in his collection pom