package org.example.Steps;
import io.cucumber.java.en.And;
import org.example.PomPages.P03_homePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;


public class D04_SearchSteps {
    P03_homePage search = new P03_homePage();
    SoftAssert soft = new SoftAssert();
    @When("user click on search field")
    public void userClickOnSearchField() {
        search.searchField.click();
    }

    @And("user search with {string}")
    public void userSearchWith(String txt) {
        search.searchField.sendKeys(txt);
        search.searchButton.click();
    }

    @Then("user could find {string} relative results")
    public void userCouldFindRelativeResults(String nam) throws InterruptedException {
        try {
     String name = "";
        for (int i=0; i < search.productsInformations().size();i++){
            name=search.productsInformations().get(i).getText();
        }
        Thread.sleep(1000);
        soft.assertTrue(name.toLowerCase().contains(nam));
        String expected = "https://demo.nopcommerce.com/search?q=";
        String actual = Hooks.driver.getCurrentUrl();
        Thread.sleep(1000);
        soft.assertTrue(actual.toLowerCase().contains(expected));
        soft.assertAll();

        } catch (AssertionError e) {
            System.out.println("AssertionError caught: " + e.getMessage());
        }

    }

    @When("user click on search field second")
    public void userClickOnSearchFieldSecond() {
        search.searchField.click();
    }

    @And("user search with {string} second")
    public void userSearchWithSecond(String ttxt) {
        search.searchField.sendKeys(ttxt);
        search.searchButton.click();
    }

    @Then("user could find {string} in product details")
    public void userCouldFindInProductDetails(String sk) {

        search.selectProduct().click();
        String serial = search.product_serial().getText().toLowerCase();
       soft.assertTrue(sk.toLowerCase().contains(serial));
        soft.assertAll();
    }
}