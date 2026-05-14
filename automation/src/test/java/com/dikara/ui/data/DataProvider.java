package com.dikara.ui.data;

import com.dikara.ui.dto.login.LoginRequest;

public class DataProvider {
    @org.testng.annotations.DataProvider(name = "loginData")
    public Object[][] loginData(){
        return new Object[][]{
                {new LoginRequest("standard_user", "secret_sauce"), true},
                {new LoginRequest("standard_user", "wrong_password"), false},
        };

    }
}
