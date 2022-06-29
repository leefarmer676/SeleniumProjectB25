package com.cydeo.b26_tasks;

import com.cydeo.tests.base.TestBase;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

/*
TC : Etsy Scroll down test
1. Go to https://www.etsy.com
2. Scroll down
3. Generate random email and enter into subscribe box
4. Click on Subscribe
5. Verify "Great! We've sent you an email to confirm
your subscription." is displayed
 */
public class T3_EtsySubscribeTest extends TestBase {
    @Test
    public void etsySubscribeTest(){
        driver.get("https://www.etsy.com");

        WebElement subscribeBox = driver.findElement(By.id("email-list-signup-email-input"));

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView(true)", subscribeBox );

        Faker faker = new Faker();
        String randomEmailAddress = faker.internet().emailAddress().toString();
        subscribeBox.sendKeys(randomEmailAddress);

        WebElement subscribeBtn = driver.findElement(By.xpath("//button[@class='wt-btn wt-input-btn-group__btn']"));
        subscribeBtn.click();

        WebElement successText = driver.findElement(By.xpath("//div[@class='wt-alert wt-alert--inline wt-alert--success-01 wt-text-body-01']"));
        String expectedText = "Great! We've sent you an email to confirm your subscription.";
        String actualText = successText.getText();
        assertTrue(expectedText.equals(actualText));

    }
}
