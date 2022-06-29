package com.cydeo.b26_tasks;

import com.cydeo.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

/*
TC #7: Scroll using JavascriptExecutor
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/large
3- Scroll down to “Cydeo” link
4- Scroll up to “Home” link
5- Use below provided JS method only
JavaScript method to use : arguments[0].scrollIntoView(true)
Note: You need to locate the links as web elements and pass them as
arguments into executeScript() method
 */
public class JSExecutor_Scroll_Practice extends TestBase {
    @Test
    public void JSExecutorScrollPractice() throws InterruptedException{
        driver.get("https://practice.cydeo.com/large");

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        WebElement cydeoLink = driver.findElement(By.linkText("CYDEO"));
        WebElement homeLink = driver.findElement(By.linkText("Home"));
        jse.executeScript("arguments[0].scrollIntoView(true)", cydeoLink);
        Thread.sleep(3000);
        jse.executeScript("arguments[0].scrollIntoView(true)", homeLink);
    }
}
