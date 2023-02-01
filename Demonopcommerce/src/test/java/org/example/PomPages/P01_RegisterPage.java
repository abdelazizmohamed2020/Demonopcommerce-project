package org.example.PomPages;

import org.example.Steps.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P01_RegisterPage {

    public P01_RegisterPage()
    {
        PageFactory.initElements(Hooks.driver, this);
    }

@FindBy(className = "ico-register")

    public WebElement registerLink;

@FindBy(id = "gender-male")
    public WebElement gender;

@FindBy(id = "FirstName")
    public WebElement firstName;

@FindBy(id = "LastName")
    public WebElement lastName;

@FindBy(name = "DateOfBirthDay" )
    public WebElement dayList;

@FindBy(name = "DateOfBirthMonth")
    public WebElement monthList;

@FindBy(name = "DateOfBirthYear")
    public WebElement yearList;

@FindBy(id = "Email")
    public WebElement email;

@FindBy(id = "Password")
    public WebElement password;

@FindBy(id = "ConfirmPassword")
    public WebElement confirmPassword;


@FindBy(id = "register-button")
    public WebElement clickButton;

@FindBy(className = "result")
    public WebElement successMassage;





}
