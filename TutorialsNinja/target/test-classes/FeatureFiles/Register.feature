Feature: Registraition functionality scenarios

  @Register @One
  Scenario: Verify whether the user is able to register into the application by providing all the fields
    Given I launch the application
    And I navigate to Account Registration page
    When I provide all the below valid details
      | FirstName | MD                      |
      | LastName  | ARIF                   |
      | Email     | mdimranzama3110@gmail.com |
      | Telephone | 7061651398                |
      | Password  | Hussain                   |
    And I select the Privacy Policy
    And I click on Continue button
    Then I should see that the User Account has successfully created

  @Register @Two
  Scenario: Verify whether the user is not allowed to register on skipping mandatory fields
    Given I launch the application
    And I navigate to Account Registration page
    When I click on Continue button
    Then I should see that the User Account is not created
    And I should see the error messages informing the user to fill the mandatory fields

    
    @Register @Three
  Scenario: Verify whether the user is able to register into the application by opting for Newsletter subscription
  	Given I launch the application
  	And I navigate to Account Registration page
	When I provide all the below valid details
    	| FirstName | ARIF                      |
      | LastName  | HUSSAIN                   |
      | Email     | mdimranzama3110@gmail.com |
      | Telephone | 7061651398                |
      | Password  | Hussain                   |
    And I subscribe to Newsletter
    And I select the Privacy Policy
    And I click on Continue button
    Then I should see that the User Account has successfully created
    
    @Register @Four
    Scenario: Verify whether the user is restricted from registring a duplicate account
  	Given I launch the application
  	And I navigate to Account Registration page
  	When I provide the below duplicate details
  		| FirstName | ARIF                      |
      | LastName  | HUSSAIN                   |
      | Email     | mdimranzama3110@gmail.com |
      | Telephone | 7061651398                |
      | Password  | Hussain                   |
    And I select the Privacy Policy
    And I click on Continue button
		Then I should see the warning message stating that the user is already created