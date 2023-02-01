package org.example.PomPages;

import org.example.Steps.Hooks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class P02_LoginPage {
  public WebElement logInClick(){
    return Hooks.driver.findElement(By.className("ico-login"));
  }
  public WebElement Email(){
    return Hooks.driver.findElement(By.id("Email"));
  }
  public WebElement PasswordLogIn(){
    return Hooks.driver.findElement(By.id("Password"));
  }
  public WebElement logInAccount(){
    return Hooks.driver.findElement(By.className( ("ico-account")));
  }
  public WebElement  backgroundColor(){
    return Hooks.driver.findElement(By.className("message-error validation-summary-errors"));
  }

}