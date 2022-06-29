package com.cydeo.b26_tasks;

import com.cydeo.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/*
TC #3: Hover Test
1. Go to https://practice.cydeo.com/hovers
2. Hover over to first image
3. Assert: a. “name: user1” is displayed
b. “view profile” is displayed
4. Hover over to second image
5. Assert:  a. “name: user2” is displayed
b. “view profile” is displayed
6. Hover over to third image
7. Confirm:  a. “name: user3” is displayed
b. “view profile” is displayed
 */
public class HW_Actions_Hover extends TestBase {
    @Test
    public void hoverTest(){
        driver.get("https://practice.cydeo.com/hovers");

        WebElement image1 = driver.findElement(By.xpath("(//div[@class='figure'])[1]"));
        WebElement image1Text = driver.findElement(By.xpath("//h5[.='name: user1']"));
        WebElement image1LinkText = driver.findElement(By.xpath("//a[@href='/users/1']"));

        WebElement image2 = driver.findElement(By.xpath("(//div[@class='figure'])[2]"));
        WebElement image2Text = driver.findElement(By.xpath("//h5[.='name: user2']"));
        WebElement image2LinkText = driver.findElement(By.xpath("//a[@href='/users/2']"));

        WebElement image3 = driver.findElement(By.xpath("(//div[@class='figure'])[3]"));
        WebElement image3Text = driver.findElement(By.xpath("//h5[.='name: user3']"));
        WebElement image3LinkText = driver.findElement(By.xpath("//a[@href='/users/3']"));

        Actions actions = new Actions(driver);
        actions.moveToElement(image1).perform();
        assertTrue(image1Text.isDisplayed());
        assertTrue(image1LinkText.isDisplayed());

        actions.moveToElement(image2).perform();
        actions.moveToElement(image2).perform();
        assertTrue(image2Text.isDisplayed());
        assertTrue(image2LinkText.isDisplayed());

        actions.moveToElement(image3).perform();
        actions.moveToElement(image3).perform();
        assertTrue(image3Text.isDisplayed());
        assertTrue(image3LinkText.isDisplayed());


    }
}
