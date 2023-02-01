package org.example.Steps;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.PomPages.P01_RegisterPage;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;


public class D01_RegisterSteps {

P01_RegisterPage register = new P01_RegisterPage();


    @Given("user go to register page")

    public void goRegisterPage() {
        register.registerLink.click();


    }


    @When("user select gender type")
    public void SelectGender() {
    register.gender.click();
    }

    @And("user enter first name {string} and last name {string}")
    public void FirstNameAndLastName(String firstName, String lastName) {
        register.firstName.sendKeys(firstName);
        register.lastName.sendKeys(lastName);
    }

    @And("user enter date of birth")
    public void dateOfBirth() {
        Select selectDay = new Select(register.dayList);
        selectDay.selectByValue("6");

        Select selectMonth = new Select(register.monthList);
        selectMonth.selectByValue("3");

        Select selectYear = new Select(register.yearList);
        selectYear.selectByIndex(9);
    }


    @And("user enter email field")
    public CharSequence enterEmail() {

       Faker fake = new Faker();

      String emailAddress =  fake.internet().safeEmailAddress();
        System.out.println(emailAddress);
        register.email.sendKeys(emailAddress);

        return emailAddress;
    }


    @And("user fills Password fields {string} {string}")
    public void passwordFields(String password, String confirmPassword) {
    register.password.sendKeys(password);
    register.confirmPassword.sendKeys(confirmPassword);


    }

    @And("user clicks on register button")
    public void clicksOnRegisterButton() {
register.clickButton.click();
    }

    @Then("success message is displayed")
    public void successRegistration() {

        SoftAssert soft = new SoftAssert();
       soft.assertTrue(register.successMassage.getText().contains("Your registration completed"));


        String actualColor = register.successMassage.getCssValue("color");

soft.assertEquals(Color.fromString(actualColor).asHex(),"#4cb17c");


soft.assertAll();
    }


}
