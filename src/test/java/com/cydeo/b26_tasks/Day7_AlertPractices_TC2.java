package com.cydeo.b26_tasks;

import com.cydeo.tests.b26_utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
TC #2: Confirmation alert practice
1. Open browser
2. Go to website: http://practice.cydeo.com/javascript_alerts
3. Click to “Click for JS Confirm” button
4. Click to OK button from the alert
5. Verify “You clicked: Ok” text is displayed.
 */
public class Day7_AlertPractices_TC2 {
    public WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cydeo.com/javascript_alerts");
    }

    @Test
    public void jsConfirm(){
        WebElement jsConfirmBtn = driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));
        jsConfirmBtn.click();

        Alert jsAlert = driver.switchTo().alert();
        jsAlert.accept();

        WebElement resultText = driver.findElement(By.id("result"));
        Assert.assertTrue(resultText.isDisplayed());
        driver.close();

    }
}
