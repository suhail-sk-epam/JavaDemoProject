Feature: Validate Product Information on PDF

  Scenario: Generate and validate PDF from the Products page
    Given the user is on the Products page
    When the user uses the system's print function to generate a PDF
    Then the PDF should contain accurate product names and prices as displayed on the website

  Scenario: Check PDF content against website details
    Given the user has generated a PDF from the Products page
    When the user compares the product information in the PDF against the website
    Then the information should match exactly with the website details