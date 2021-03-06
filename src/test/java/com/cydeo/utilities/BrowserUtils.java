package com.cydeo.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.Set;
import java.util.concurrent.TimeUnit;

/*
In this class only general utility methods that are not related to some specific page
 */
public class BrowserUtils {
    /* This method will accept int (in seconds) and execute Thread.sleep for given duration

     */
    public static void sleep(int second){
        second *= 1000;
        try {
            Thread.sleep(second);
        }catch (InterruptedException e){

        }
    }
/*
this method accepts 3 arguments
1. webdriver
2. expectedInUrl: for verify if the url contains given String
    - if condition matches, will break loop
3. expectedInTitle to be compared against actualTitle
 */
    public static void switchWindowAndVerify(WebDriver driver, String expectedInUrl, String expectedInTitle){
        Set<String> allWindowsHandles = driver.getWindowHandles();
        for (String each : allWindowsHandles) {
            driver.switchTo().window(each);
            System.out.println("Current URL: " + driver.getCurrentUrl());

            if (driver.getCurrentUrl().contains(expectedInUrl)) {
                break;                 //this makes it stop with the Etsy tab open
                //not using windowHandle because they are randomly changing values
            }
        }
        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedInTitle));

        //BrowserUtils.switchWindowAndVerify(driver, "etsy", "Etsy");

        /*
        This method accepts a String "expectedTitle" and Asserts if it is true
         */

    }
    public static void verifyTitle(WebDriver driver, String expectedTitle ){

        Assert.assertEquals(driver.getTitle(), expectedTitle);
    }

    public static void waitForInvisibilityOf(WebElement webElement){
        Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        WebDriverWait webDriverWait = new WebDriverWait(Driver.getDriver(), 10);
        webDriverWait.until(ExpectedConditions.invisibilityOf(webElement));
    }
}
