Project Demo for using ScreenPlay pattern with Serenity and Cucumber.
In this project , there are both Page Object and ScreenPlay patterns.
you can run them dedicated by running the coresponding Test Runner.



web app: https://unsplash.com/

  @add-search-result
  Scenario: Add search result picture into new Collection.
    Given that Thach Hoang is a registered member
    And Thach Hoang logged in valid credential
    When he searches pics with keyword "Cute Puppies"
    And he adds the first image into new collection name "Puppies Collection"
    And he navigates to his collection page
    Then he can see the new collection is added in his collection
	
Project Structure:

com.unsplash pkg
|---cucumber
|-----|--steps
|-----|----|--POMSteps.java
|-----|----|--ScreenPlaySteps.java
|---POM
|-----|---*Page.java
|---ScreenPlay
|-----|---abilities
|-----|---tasks
|-----|---questions
|-----|---user_interfaces
|-----|---interactions
|---pomFeatures
|-----|---addCollection.feature
|---screenPlayFeatures
|-----|---addCollection.feature
