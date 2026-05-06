package com.dikara.ui.tests;

import com.dikara.ui.BaseTestUI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTestUI {
    @Test
    public void loginSuccess(){
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        driver.findElement(By.id("login-button")).click();

        String url = driver.getCurrentUrl();
        Assert.assertTrue(url.contains("inventory"));
    }

}
