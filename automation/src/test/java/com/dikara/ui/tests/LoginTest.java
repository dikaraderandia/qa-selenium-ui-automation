package com.dikara.ui.tests;

import com.dikara.ui.BaseTestUI;
import com.dikara.ui.data.DataProvider;
import com.dikara.ui.dto.login.LoginRequest;
import com.dikara.ui.pages.CartPage;
import com.dikara.ui.pages.InventoryPage;
import com.dikara.ui.pages.LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;

import org.testng.annotations.Test;

public class LoginTest extends BaseTestUI {
    @Test
    public void loginSuccess(){
        LoginPage loginPage = new LoginPage(driver, wait);

        loginPage.login("standard_user", "secret_sauce");

        InventoryPage inventoryPage =
                new InventoryPage(driver, wait);

        Assert.assertTrue(
                inventoryPage.isInventoryPageDisplayed()
        );

        Assert.assertEquals(
                inventoryPage.getPageTitle(),
                "Products"
        );
    }

    @Test
    public void addCartSuccess(){
        LoginPage loginPage = new LoginPage(driver, wait);
        loginPage.login("standard_user", "secret_sauce");

        InventoryPage inventoryPage = new InventoryPage(driver, wait);
        inventoryPage.addToCart();
        inventoryPage.clickCart();

        CartPage cartPage = new CartPage(driver);

        Assert.assertEquals(cartPage.getCartName(), "Sauce Labs Backpack");

    }

    @Test
    public void loginFailed(){
        LoginPage loginPage = new LoginPage(driver, wait);

        loginPage.login("standard_user", "secsdfsfsfret_sauce");
        Assert.assertTrue(loginPage.isDisplayedError());
        Assert.assertEquals(loginPage.getDisplayErrorMessage(), "Epic sadface: Username and password do not match any user in this service");

    }

    @Test(dataProvider = "loginData", dataProviderClass = DataProvider.class)
    public void loginUsingDataProvider (LoginRequest loginRequest, Boolean isSuccess){

        LoginPage loginPage = new LoginPage(driver, wait);
        loginPage.login(loginRequest.getUsername(), loginRequest.getPassword());

        if (isSuccess){

            InventoryPage inventoryPage =
                    new InventoryPage(driver, wait);
            Assert.assertTrue(inventoryPage.isInventoryPageDisplayed());

        }else{
            Assert.assertTrue(loginPage.isDisplayedError());
        }


    }




}
