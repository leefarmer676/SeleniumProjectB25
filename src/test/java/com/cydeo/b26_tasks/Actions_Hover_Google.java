package com.cydeo.b26_tasks;

import com.cydeo.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

/*
TC : Google hover over test

1. Go to  https://www.google.com
2. Hover over on Search button
3. Hover over on Feeling Lucky button
 */
public class Actions_Hover_Google extends TestBase {
    @Test
    public void actionsHoverGoogle(){
      driver.get("https://www.google.com");

        WebElement googleSearchBtn = driver.findElement(By.xpath("(//input[@aria-label='Google Search'])[2]"));

        Actions action = new Actions(driver);
        action.moveToElement(googleSearchBtn).perform();

        WebElement feelingLuckyBtn = driver.findElement(By.id("gbqfbb"));
        action.moveToElement(feelingLuckyBtn).perform();

    }
}
