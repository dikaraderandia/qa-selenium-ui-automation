package com.dikara.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage {

    private WebDriver driver;

    public InventoryPage(WebDriver driver){
        this.driver = driver;

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
        driver.findElement(inventoryAddButtonCart).click();
    }

    public void clickCart(){
        driver.findElement(buttonCart).click();
    }
}
