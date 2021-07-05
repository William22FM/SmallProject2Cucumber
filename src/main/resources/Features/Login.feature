Feature: Login

  Scenario: TC-RegisterWrongEmailFormat
    Given I go to Url1
    When I input Email1
    And I click button submit3
    Then contain Home

  Scenario: TC-RegisterEmptyEmail
    Given I clock text login
    When I click button submit2
    Then create account error1

  Scenario: TC-RegisterRightEmailandDidn’t FillFullContentRequirements
    Given I input Email2
    When I click button Register1
#    I click button submit1
#    And I click gander1
#    And I input fist name1
#    And I input last name2
#    And I click date1
#    And I click month1
#    And I click year1
#    And I click News1
#    And I click offers1
#    And
    Then create account error5

  Scenario: TC-RegisterRightEmailandFillAllContentRequirements
    Given  I input Email3
    When I click button Register
#    I click button submit4
#    And I click gander
#    And I input fist name
#    And I input last name
#    And I input Password1
#    And I click date
#    And I click month
#    And I click year
#    And I click News
#    And I click offers
    Then  create account done

  Scenario: TC-LoginWrongFormatEmail-Message_invalid_email_address
    Given I go to Url2
    When I input Email5
#    And I input password3
#    And I click button submit5
    Then Login account error4

  Scenario: TC-LoginWrongEmail-Message_authentication_failed
    Given I go to Url3
    When I input Email8
    Then create account error8

  Scenario: C-LoginWrongPassword
   Given I input Email7
    When I input password7
    Then create account error7

  Scenario: TC-LoginRight
    Given I input Email
    When I input password
    Then login done

  Scenario: TC-Logout
    Given I click user
    Then I click log out
