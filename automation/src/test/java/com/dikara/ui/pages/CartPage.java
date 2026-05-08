package com.dikara.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

    private WebDriver driver;

    public CartPage(WebDriver webDriver){
        this.driver = webDriver;
    }

    private By cartItem = By.className("inventory_item_name");

    public String getCartName(){
        return driver.findElement(cartItem).getText();
    }
}
