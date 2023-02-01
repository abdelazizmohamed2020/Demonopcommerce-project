package org.example.Steps;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.PomPages.P03_homePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;


public class D06_HomeSlidersSteps {
    P03_homePage home = new P03_homePage();

    WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(8));

    @When("I click on the first slider")
    public void i_click_on_the_first_slider() {

        home.clickNokiaSlider().click();
    }

    @Then("I should be redirected to the Nokia URL")
    public void i_should_be_redirected_to_the_correct_URL() {
        home.isNokiaClickable();
        wait.until(ExpectedConditions.urlContains("nokia-lumia-1020"));
        Assert.assertTrue(Hooks.driver.getCurrentUrl().contains("nokia-lumia-1020"));
    }

    @When("I click on the second slider")
    public void i_click_on_the_second_slider() {

       home.clickIphoneSlider().click();
    }

    @Then("I should be redirected to the iphone URL")
    public void iShouldBeRedirectedToTheIphoneURL() {
        home.isIphoneSliderClickable();
        wait.until(ExpectedConditions.urlContains("nokia-lumia-1020"));
        Assert.assertTrue(Hooks.driver.getCurrentUrl().contains("nokia-lumia-1020"));
    }
}
