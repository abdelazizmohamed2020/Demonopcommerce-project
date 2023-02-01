package org.example.Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.PomPages.P02_LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.asserts.SoftAssert;

public class D02_LoginSteps {
    P02_LoginPage logIn = new P02_LoginPage();

    D01_RegisterSteps newEmail = new D01_RegisterSteps();


    @Given("user go to log in page")
    public void logInClick() {
        logIn.logInClick().click();
    }

    @When("user login with valid {string} and {string}")
    public void userLoginWithValidAnd(String mail, String pass) {

        logIn.Email().sendKeys(mail);
        logIn.PasswordLogIn().sendKeys(pass);
        logIn.PasswordLogIn().sendKeys(Keys.ENTER);
    }

    @Then("user log in successfully")
    public void LogIn_Done() {
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(logIn.logInAccount().isDisplayed(), true);
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/"));
        soft.assertAll();
    }

    @When("user login with invalid {string} and {string}")
    public void userLoginWithInvalidAnd(String wrongMail, String wrongPass) {
        logIn.Email().sendKeys(wrongMail);
        logIn.PasswordLogIn().sendKeys(wrongPass);
        logIn.PasswordLogIn().sendKeys(Keys.ENTER);
    }

    @Then("user cannot log in")
    public void userLogInUnsuccessfully() {
        String color = Hooks.driver.findElement(By.cssSelector("div[class=\"message-error validation-summary-errors\"]")).getCssValue("color");

        SoftAssert soft = new SoftAssert();
        soft.assertEquals(color, "rgba(228, 67, 75, 1)");
        soft.assertAll();

    }
}


