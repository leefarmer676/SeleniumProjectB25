package com.cydeo.tests.b26_day3_css_getAttribute_getText;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_Locators_getText {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com");

        WebElement userName = driver.findElement(By.className("login-inp"));
        userName.sendKeys("incorrect");

        WebElement password = driver.findElement(By.name("USER_PASSWORD"));
        password.sendKeys("incorrect");

        WebElement loginButton = driver.findElement(By.className("login-btn"));
        loginButton.click();

        String expectedText = "Incorrect login or password";
        WebElement errormsg = driver.findElement(By.className("errortext"));
        String actualText = errormsg.getText(); //gets text from WebElement

        if(actualText.equals(expectedText)){
            System.out.println("Error message verification passed!");
        }else{
            System.out.println("Failed");
        }

        driver.quit();





    }
}
