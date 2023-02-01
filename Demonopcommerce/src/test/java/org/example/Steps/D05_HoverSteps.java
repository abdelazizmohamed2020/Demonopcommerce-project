package org.example.Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.PomPages.P03_homePage;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class D05_HoverSteps {

    P03_homePage hover = new P03_homePage();

    @When("user hover categories")
    public void hover()
    {
        Actions action = new Actions(Hooks.driver);
        action.moveToElement(hover.mouse3Hover).perform();
        action.moveToElement(hover.mouse2Hover).perform();
        action.moveToElement(hover.mouseHover).perform();
    }


    @And("user click on subcategory")
    public void userClickOnSubcategory() {
        hover.deskHover.click();
    }

    @Then("user go to product page")
    public void userGoToProductPage() {
        String expected="Desktops";
        String actual=hover.titleHover.getText();
        Assert.assertTrue(actual.contains(expected));
    }
}
