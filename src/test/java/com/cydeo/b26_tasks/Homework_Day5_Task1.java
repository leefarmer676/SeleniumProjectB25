package com.cydeo.b26_tasks;

import com.cydeo.tests.b26_utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*
TC #1: Tesla “Solar Panel” header verification
1. Open a Chrome browser
2. Go to: https://www.tesla.com
3. Locate Solar Panels header
4. Verify if it is displayed on the page
 */
public class Homework_Day5_Task1 {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.tesla.com");
        driver.manage().window().maximize();

        WebElement solarPanelsHeader = driver.findElement(By.xpath("//a[@title='Solar Panels']/span"));
        boolean isDisplayed = solarPanelsHeader.isDisplayed();
        System.out.println("isDisplayed = " + isDisplayed);
        driver.close();
    }
}
