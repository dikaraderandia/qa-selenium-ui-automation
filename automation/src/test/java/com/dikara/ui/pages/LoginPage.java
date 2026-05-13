package com.dikara.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    private WebDriver driver;
    private WebDriverWait driverWait;

    public LoginPage(WebDriver driver, WebDriverWait driverWait){
        this.driver = driver;
        this.driverWait = driverWait;
    }

    //LOCATOR
    private By usernameInput = By.id("user-name");
    private By passwordInput = By.id("password");
    private By loginButton = By.id("login-button");

    private By errorMessage = By.cssSelector("h3[data-test='error']");

    //ACTION
    public void enterUsername (String username){
        driver.findElement(usernameInput).sendKeys(username);
    }

    public void enterPassword (String password){
        driver.findElement(passwordInput).sendKeys(password);
    }

    public void clickLogin(){
        driver.findElement(loginButton).click();
    }

    public void login(String username, String password){
        enterUsername(username);
        enterPassword(password);
        clickLogin();
    }

    public boolean isDisplayedError(){
        driverWait.until (ExpectedConditions.visibilityOfElementLocated(errorMessage));

        return driver.findElement(errorMessage).isDisplayed();
    }

    public String getDisplayErrorMessage(){
        return driver.findElement(errorMessage).getText();
    }


}
