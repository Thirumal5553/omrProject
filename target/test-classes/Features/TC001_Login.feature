@Login
Feature: Verifying OMR Branch Hotel Login Module

  Scenario Outline: Verifying login with valid credentials without Enter Key
    Given User is on the OMR Branch hotel page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Thirumalazhagan"

    Examples: 
      | userName               | password      |
      | thirumal5553@gmail.com | Thirumal@1995 |

  Scenario Outline: Verifying login with valid credentials with Enter Key
    Given User is on the OMR Branch hotel page
    When User login "<userName>" and "<password>" with enter key
    Then User should verify success message after login "Welcome Thirumalazhagan"

    Examples: 
      | userName               | password      |
      | thirumal5553@gmail.com | Thirumal@1995 |

  Scenario Outline: Verifying login with invalid credentials
    Given User is on the OMR Branch hotel page
    When User login "<userName>" and "<password>"
    Then User should verify error message after login "Invalid Login details or Your Password might have expired."

    Examples: 
      | userName               | password     |
      | thirumal5553@gmail.com | Thirumal@195 |
