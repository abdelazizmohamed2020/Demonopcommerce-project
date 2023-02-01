package org.example.Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.PomPages.P03_homePage;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class D08_WishlistSteps {

    P03_homePage wish = new P03_homePage();
    WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(9));

    SoftAssert soft = new SoftAssert();

    @When("click on the wishlist button for {string}")
    public void clickWishlistButton(String product) {
    wish.clickWishlistButton().click();
    }


    @Then("verify the success message {string} is displayed with a green background color")
    public void verifyTheSuccessMessageIsDisplayedWithAGreenBackgroundColor(String message) {
        wait.until(ExpectedConditions.visibilityOf(wish.isSuccessMessageDisplayed())).isDisplayed();
        String expected="The product has been added to your wishlist";
        String actual = wish.isSuccessMessageDisplayed().getText();
        soft.assertTrue(actual.contains(expected),"not products in wishlist");

        String actualColor = wish.getBackgroundColor().getCssValue("background-color");

        soft.assertEquals(Color.fromString(actualColor).asHex(),"#4bb07a","color false");
        soft.assertAll();
    }

    @When("user click on the wishlist button for {string}")
    public void userClickOnTheWishlistButtonFor(String name) {
        wish.clickWishlistButton().click();
        
    }

    @And("wait until the success message disappears")
    public void waitUntilTheSuccessMessageDisappears() {
        wait.until(ExpectedConditions.invisibilityOf(wish.isSuccessMessageDisplayed()));
    }

    @And("click on the {string} tab")
    public void clickOnTheTab(String tab) {
       wish.clickWishlistTab().click();
    }

    @Then("verify that the Qty value is greater than {int}")
    public void verifyThatTheQtyValueIsGreaterThan(int num) {
        wait.until(ExpectedConditions.visibilityOf(wish.getQtyValue())).isDisplayed();
        int actualValue = Integer.parseInt(wish.getQtyValue().getAttribute("value"));

        boolean x = actualValue > 0;

        soft.assertTrue(x);
        soft.assertAll();
    }
}
