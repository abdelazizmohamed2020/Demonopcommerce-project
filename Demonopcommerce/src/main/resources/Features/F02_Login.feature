@smoke
Feature: Login
  Scenario:SC2- User could log in with valid email and password

    Given user go to log in page
    When  user login with valid "dorothea.rempel@example.com" and "P@ssw0rd"
    Then user log in successfully


  Scenario:SC2- User could log in with invalid email and password

    Given user go to log in page
    When user login with invalid "wrong@example.com" and "P@ssw0rd"
    Then user cannot log in