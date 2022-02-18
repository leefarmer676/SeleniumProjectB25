package com.cydeo.tests.day2_locators_getText_getAttribute;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Day2_Homework2 {
    public static void main(String[] args) {
        WebDriver driver;
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://zero.webappsecurity.com/login.html");

        WebElement actualHeaderText = driver.findElement(By.tagName("h3"));
        String HeaderText = actualHeaderText.getText();
        String expectedHeaderText = "Log in to ZeroBank";

        if(HeaderText.equals(expectedHeaderText)){
            System.out.println("Header text verification passed");
        }else{
            System.out.println("Header text verification failed");
        }


    }
}
