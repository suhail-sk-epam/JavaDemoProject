Feature: Complete Purchase Process
  Scenario: Enter User Details on Checkout Page
    Given the user navigates to the checkout page
    When the user enters their details
    Then the details should be accepted without errors

  Scenario: Review and Confirm Order Details
    Given the user has entered their details
    When the user proceeds to review their order
    Then the order details should be displayed for review

  Scenario: Successful Order Submission
    Given the user confirms their order details
    When the user submits the order
    Then a confirmation page should be displayed with the order summary