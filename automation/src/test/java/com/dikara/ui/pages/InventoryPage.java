package com.dikara.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InventoryPage {

    private WebDriver driver;
    private WebDriverWait driverWait;

    public InventoryPage(WebDriver driver, WebDriverWait driverWait){
        this.driver = driver;
        this.driverWait = driverWait;

    }

    //LOCATOR
    private By inventoryContainer = By.id("inventory_container");
    private By inventoryTitle = By.className("title");

    private By inventoryAddButtonCart = By.id ("add-to-cart-sauce-labs-backpack");

    private By buttonCart = By.className("shopping_cart_link");

    // validation
    public boolean isInventoryPageDisplayed() {
        return driver.findElement(inventoryContainer).isDisplayed();
    }

    public String getPageTitle() {
        return driver.findElement(inventoryTitle).getText();
    }

    public void addToCart(){
        driverWait.until(
                ExpectedConditions.elementToBeClickable(
                        inventoryAddButtonCart
                )
        );


        driver.findElement(inventoryAddButtonCart).click();
    }

    public void clickCart(){
        driver.findElement(buttonCart).click();
    }
}
