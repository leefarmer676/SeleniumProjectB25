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
TC #3: Information alert practice
1. Open browser
2. Go to website: http://practice.cydeo.com/javascript_alerts
3. Click to “Click for JS Prompt” button
4. Send “hello” text to alert
5. Click to OK button from the alert
6. Verify “You entered:  hello” text is displayed.
 */
public class Day7_AlertPractices_TC3 {
    public WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cydeo.com/javascript_alerts");
    }

    @Test
    public void jsPrompt(){
        WebElement jsPromptBtn = driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));
        jsPromptBtn.click();

        Alert alert = driver.switchTo().alert();
        alert.sendKeys("hello");
        alert.accept();

        WebElement resultText = driver.findElement(By.id("result"));
        String actualText = resultText.getText();
        System.out.println("actualText = " + actualText);
        String expectedText = "You entered: hello";
        System.out.println("expectedText = " + expectedText);
        Assert.assertEquals(actualText, expectedText);

    }
}
