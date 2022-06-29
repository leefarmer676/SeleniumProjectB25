package com.cydeo.b26_tasks;

import com.cydeo.tests.base.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
public class TC2_WindowHandlePractice extends TestBase {

    @Test
    public void windowHandlePractice() {
        driver.get("https://www.amazon.com ");
        ((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");

        System.out.println(driver.getTitle());
        String etsyHandle = null;
        for (String eachHandle : driver.getWindowHandles()) {
            driver.switchTo().window(eachHandle);
            System.out.println(driver.getTitle());
            if(driver.getTitle().contains("Etsy")){
                break; //this will stop it on the etsy URL
            }
        }
        
        Assert.assertTrue(driver.getTitle().contains("Etsy"));
    }

}
