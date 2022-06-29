package com.cydeo.b26_tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

/*
1- Open a chrome browser
	2- Go to: https://practice.cydeo.com/
	3- Click Sign Up For Mailing List ( by using partialLinkText locator)
	4- Verify title equals:
	   Expected: Sign Up
	5- Fill form with following information  (by using name locator)
			fullname : John Smith
			email    : john@cydeo.com
	6- Click on Sign Up Button (by using name locator)
	7- Verify title equals:
	   Expected: Signup Confirmation

 */
public class Task2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.cydeo.com/");

        WebElement mailingListButton = driver.findElement(By.partialLinkText("Mailing List"));
        mailingListButton.click();

        WebElement fullName = driver.findElement(By.name("full_name"));
        fullName.sendKeys("John Smith");

        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("john@cydeo.com");

        WebElement signUpButton = driver.findElement(By.name("wooden_spoon"));
        signUpButton.click();

        Assert.assertEquals(driver.getTitle(), "Signup Confirmation");

        driver.close();
    }
}
