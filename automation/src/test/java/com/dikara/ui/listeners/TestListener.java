package com.dikara.ui.listeners;

import com.dikara.ui.BaseTestUI;
import com.dikara.ui.utils.ScreenshotUtil;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener  implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {

        Object currentClass =
                result.getInstance();

        WebDriver driver =
                ((BaseTestUI) currentClass)
                        .getDriver();


        ScreenshotUtil.takeScreenshot(
                driver,
                result.getName()
        );

        System.out.println(
                "Screenshot captured for failed test: "
                        + result.getName()
        );
    }

}
