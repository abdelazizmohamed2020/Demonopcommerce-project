package org.example.Steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.PomPages.P03_homePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.ArrayList;

public class D07_FollowUsSteps {
    P03_homePage follow = new P03_homePage();
    WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(9));

    SoftAssert soft = new SoftAssert();

    @When("user opens facebook link")
    public void facebook_link()
    {
        follow.face.click();

        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        ArrayList<String>tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
    }


    @Then("facebook {string} is opened in new tab")
    public void facebookIsOpenedInNewTab(String url1) {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains(url1));
        soft.assertAll();
        Hooks.driver.close();
    }

    @When("user opens twitter link")
    public void userOpensTwitterLink() {
        follow.twit.click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        ArrayList<String> tabs2 = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs2.get(1));
    }

    @Then("twitter {string} is opened in new tab")
    public void twitterIsOpenedInNewTab(String url2) {
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains(url2));
        soft.assertAll();
        Hooks.driver.close();
    }

    @When("user opens rss link")
    public void userOpensRssLink() {
        follow.rs.click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        ArrayList<String> tabs2 = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs2.get(1));
    }

    @Then("rss {string} is opened in new tab")
    public void rssIsOpenedInNewTab(String url3) {
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains(url3));
        soft.assertAll();
        Hooks.driver.close();
    }

    @When("user opens youtube link")
    public void userOpensYoutubeLink() {
        follow.you.click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        ArrayList<String> tabs2 = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs2.get(1));
    }

    @Then("youtube {string} is opened in new tab")
    public void youtubeIsOpenedInNewTab(String url4) {
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains(url4));
        soft.assertAll();

    }
}
