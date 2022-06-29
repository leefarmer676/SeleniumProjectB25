package com.cydeo.b26_tasks;

import com.cydeo.tests.b26_utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*
1. Open a chrome browser
2. Go to: https://practice.cydeo.com/abtest
3. Locate “CYDEO” link, verify it is displayed.
4. Refresh the page.
5. Verify it is displayed, again.
 */
public class Homework_Day6_Task2 {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com/abtest");
        driver.manage().window().maximize();

        WebElement cydeoLink = driver.findElement(By.linkText("CYDEO"));
        System.out.println("cydeoLink.isDisplayed() = " + cydeoLink.isDisplayed());

        driver.navigate().refresh();
        cydeoLink = driver.findElement(By.linkText("CYDEO"));
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        System.out.println("cydeoLink.isDisplayed() = " + cydeoLink.isDisplayed());
    }
}
