package com.cydeo.tests.day2_locators_getText_getAttribute;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Day2_Homework3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://google.com");
        driver.findElement(By.linkText("Gmail")).click();

        String actualTitle = driver.getTitle();

        if(actualTitle.contains("Gmail")){
            System.out.println("title verification passed");
        }else{
            System.out.println("title verification failed");
        }
        Thread.sleep(1000);
        driver.navigate().back();

        String actualHomeTitle = driver.getTitle();
        String expectedHomeTitle = "Google";

        if(actualHomeTitle.equals(expectedHomeTitle)){
            System.out.println("homepage title verification passed");
        }else{
            System.out.println("homepage title verification failed");
        }
    }
}
