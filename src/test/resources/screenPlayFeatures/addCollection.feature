@regression @add-collection
Feature: Add Collection

  @add-search-result
  Scenario: Add search result picture into new Collection.
    Given that Thach Hoang is a registered member
    Given Thach Hoang logged in valid credential
    When he searches pics with keyword "Cute Puppies"
    And he adds the first image into new collection name "Puppies Collection"
    And he navigates to his collection page
    Then he can see the new collection is added in his collection