package org.example.PomPages;
import org.example.Steps.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class P03_homePage {

    public P03_homePage() {
        PageFactory.initElements(Hooks.driver, this);
    }

    //Currencies
    @FindBy(xpath="/html/body/div[6]/div[1]/div[1]/div[1]/div/select")
    public WebElement currency;

    @FindBy(css = "span[class=\"price actual-price\"]")
    public WebElement symbol;
    public List<WebElement> getProductList() {
        List<WebElement>productsList= Hooks.driver.findElements(By.cssSelector(".product-list > div"));
        return productsList;
    }


    //Search
    @FindBy(id = "small-searchterms")
    public WebElement searchField;

    @FindBy(css = "button[class=\"button-1 search-box-button\"]")
    public WebElement searchButton;

    public List<WebElement> productsName()
    {
        List<WebElement> products =Hooks.driver.findElements(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[1]/div/div[2]/h2"));
        return products;
    }
    public List<WebElement> productsInformations()
    {
        List<WebElement> Informations=Hooks.driver.findElements(By.className("item-box"));
        return Informations;
    }


    public WebElement selectProduct()
    {
        WebElement element=Hooks.driver.findElement(By.className("picture"));
        return element;
    }
    public WebElement product_serial()
    {
        WebElement kind=Hooks.driver.findElement(By.cssSelector("div[class=\"sku\"]>span[class=\"value\"]"));
        return kind;
    }






// Hover
    @FindBy(xpath = "/html/body/div[6]/div[2]/ul[1]/li[1]/a")
    public WebElement mouseHover;

    @FindBy(xpath = "/html/body/div[6]/div[2]/ul[1]/li[2]/a")
    public WebElement mouse2Hover;

    @FindBy(xpath = "/html/body/div[6]/div[2]/ul[1]/li[3]/a")
    public WebElement mouse3Hover;

    @FindBy(xpath = "/html/body/div[6]/div[2]/ul[1]/li[1]/ul/li[1]/a")
    public WebElement deskHover;

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[3]/div/div[1]/h1")
    public WebElement titleHover;


//sliders

        public WebElement clickNokiaSlider() {
            WebElement nokiaSlider = Hooks.driver.findElement(By.cssSelector("div[class=\"nivo-controlNav\"] a[rel=\"1\"]"));
            return nokiaSlider;
        }

        public WebElement clickIphoneSlider() {
            WebElement iphoneSlider = Hooks.driver.findElement(By.cssSelector("div[class=\"nivo-controlNav\"] a[rel=\"0\"]"));
            return iphoneSlider;
        }

        public WebElement isNokiaClickable() {
            return Hooks.driver.findElement(By.cssSelector("div[class=\"nivo-controlNav\"] a[rel=\"1\"]"));

        }

        public WebElement isIphoneSliderClickable() {
              return Hooks.driver.findElement(By.cssSelector("div[class=\"nivo-controlNav\"] a[rel=\"0\"]"));

        }

    //follow us
    @FindBy(className = "facebook")
        public WebElement face;

    @FindBy(className = "twitter")
    public WebElement twit;

    @FindBy(className = "rss")
    public WebElement rs;

    @FindBy(className = "youtube")
    public WebElement you;


    //wishList

    public WebElement clickWishlistButton() {
        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[3]/div/div[2]/div[3]/div[2]/button[3]"));

    }

    public WebElement isSuccessMessageDisplayed() {
         WebElement messageDisplayed =Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]"));
        return messageDisplayed;
    }

    public WebElement getBackgroundColor() {
        WebElement backgroundColor= Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]"));
backgroundColor.getCssValue("background-color");
        return backgroundColor;

    }

    public WebElement clickWishlistTab() {
         WebElement wishTab = Hooks.driver.findElement(By.cssSelector("span[class=\"wishlist-label\"]"));
        return wishTab;
    }

    public WebElement getQtyValue() {
        WebElement  value = Hooks.driver.findElement(By.className("qty-input"));

        return value;
    }



    }



