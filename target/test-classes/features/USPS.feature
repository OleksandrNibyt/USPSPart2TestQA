@usps
Feature: USPS feature

  @usps1
  Scenario Outline: Usps Stamps & Boxes
    Given I navigate to "usps" page
    When I go to usps "<store>" store
    And I sort usps results by "Price (Low-High)"
    Then I verify that usps "<item>" is cheapest
    Examples:
      | store  | item          |
      | stamps | Tiffany Lamp  |
      | boxes  | Priority Mail |


  @usps2
  Scenario: Usps Shoes
    Given I navigate to "usps" page
    When I go to usps "postal" store
    And I search in usps store for "shoe box"
    And I sort usps results by "Price (Low-High)"
    Then I verify that usps "Priority Mail Shoe Box" is cheapest


  @usps3
  Scenario: Sign In
    Given I navigate to "usps" page
    When I go to to "Click-N-Ship" under "Mail & Ship" menu
    Then I verify that "Sign In" required
    Then I verify that "Sign Up Now" is possible

