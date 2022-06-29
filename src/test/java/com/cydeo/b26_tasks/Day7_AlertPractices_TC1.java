package com.cydeo.b26_tasks;

import com.cydeo.tests.b26_utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
TC #1: Information alert practice
1. Open browser
2. Go to website: http://practice.cydeo.com/javascript_alerts
3. Click to “Click for JS Alert” button
4. Click to OK button from the alert
5. Verify “You successfully clicked an alert” text is displayed.
 */
public class Day7_AlertPractices_TC1 {
    public WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cydeo.com/javascript_alerts");
        driver.manage().window().maximize();

    }

    @Test
    public void alertPractice1() {
        WebElement alertButton = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        alertButton.click();

        Alert jsAlert = driver.switchTo().alert();
        jsAlert.accept();

        WebElement succesfulText = driver.findElement(By.id("result"));
        String expectedText = "You successfully clicked an alert";
        //Assert.assertTrue(succesfulText.getText().equals(expectedText));
        Assert.assertTrue(succesfulText.isDisplayed());
    }

    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }
}
