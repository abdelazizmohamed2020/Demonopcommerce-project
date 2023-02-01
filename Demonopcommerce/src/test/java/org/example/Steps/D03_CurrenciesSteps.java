package org.example.Steps;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.PomPages.P03_homePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class D03_CurrenciesSteps {

    P03_homePage selectCurrency = new P03_homePage();

    @When("user select euro from currencies list")
    public void selectEuro() {
        Select select = new Select(selectCurrency.currency);
        select.selectByValue("https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F");

    }

    @Then("Verify the Euro Symbol \\(€) is displayed on the {int} products in Home page")
    public void verifyTheEuroSymbol€IsDisplayedOnTheProductsInHomePage(int num) {

        List<WebElement> products = selectCurrency.getProductList();
        for (int i = 0; i < products.size(); i++) {

            String productText = products.get(i).getText();

            Assert.assertTrue(productText.contains("€"));
        }
    }
}


//    @Then("euro symbol {string} is displayed successfully")
//    public void euroSymbolIsDisplayed(String sumbol){
////        List<WebElement> products ;
////        products = Hooks.driver.findElements(By.partialLinkText("€"));
////        int i;
////        for (i = 0; i < products.size(); i++) {
////            System.out.println(i);}
////        Assert.assertTrue(products.toString().contains("€"));
//        Assert.assertEquals(selectCurrency.euro.get(4),4);
//    }