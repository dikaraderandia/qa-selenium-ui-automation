package com.dikara.ui.tests;

import com.dikara.ui.BaseTestUI;
import com.dikara.ui.pages.InventoryPage;
import com.dikara.ui.pages.LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTestUI {
    @Test
    public void loginSuccess(){
        LoginPage loginPage = new LoginPage(driver);

        loginPage.login("standard_user", "secret_sauce");

        InventoryPage inventoryPage =
                new InventoryPage(driver);

        Assert.assertTrue(
                inventoryPage.isInventoryPageDisplayed()
        );

        Assert.assertEquals(
                inventoryPage.getPageTitle(),
                "Products"
        );
    }

}
