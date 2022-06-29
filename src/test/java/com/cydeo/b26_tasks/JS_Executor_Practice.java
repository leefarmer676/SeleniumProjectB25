package com.cydeo.b26_tasks;

import com.cydeo.tests.base.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

/*
TC #6: Scroll using JavascriptExecutor
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/infinite_scroll
3- Use below JavaScript method and scroll
a.  750 pixels down 10 times.
b.  750 pixels up 10 times
JavaScript method to use : window.scrollBy(0,0)
 */
public class JS_Executor_Practice extends TestBase {
    @Test
    public void jsExecutorPractice() throws InterruptedException {
        driver.get("https://practice.cydeo.com/infinite_scroll");
        Thread.sleep(3000);
        JavascriptExecutor jse = (JavascriptExecutor) driver;

        for (int i = 0; i < 10; i++) {
            jse.executeScript("window.scrollBy(0,750)");
            Thread.sleep(3000);
        }

        for (int i = 1; i < 11; i++) {
            jse.executeScript("window.scrollBy(0,-750)");
        }
    }
}
