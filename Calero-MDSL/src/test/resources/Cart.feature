Feature: Placing an Order

  @Test
  Scenario: end-to-end test to purchase some devices

    Given I am on homepage
    When  I click on laptop button
    And   I select and add a laptop to cart
    When  I click on Monitors button
    And   I select and add a monitor to cart
    And   I go to cart and verify the order
    And   I press the place order button
    When  I fill the place order form
    And   I press Purchase button
    Then  Order is place successfully