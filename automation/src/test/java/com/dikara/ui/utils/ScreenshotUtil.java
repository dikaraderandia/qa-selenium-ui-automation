package com.dikara.ui.utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class ScreenshotUtil {

    public static void takeScreenshot(WebDriver driver, String testName){
        String projectPath =
                System.getProperty("user.dir");
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        File destFile = new File (  projectPath +
                "/screenshots/" +
                testName +
                ".png");

        try {

            FileUtils.copyFile(srcFile, destFile);

        } catch (IOException e) {

            e.printStackTrace();
        }

    }
}
