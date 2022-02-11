package com.cydeo.tests.day3_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_locators_getText {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/");
        //enter incorrect username: "incorrect"

        //driver.findElement(By.className("login-inp")).sendKeys("incorrect"); //can use sendKeys since this returns a web element
        //however, if we don't store it into a variable, then we can't re-use it

        WebElement inputUsername = driver.findElement(By.className("login-inp"));
        inputUsername.sendKeys("incorrect");

        //enter incorrect passowrd: "incorrect"
        //alt + enter = shortcut to auto-generate local variable
        WebElement inputPassword = driver.findElement(By.name("USER_PASSWORD"));

        //click to login button
        WebElement loginButton = driver.findElement(By.className("login-btn"));
        loginButton.click();

        //verify error message is as expected
        //expected: Incorrect login or password
        WebElement errorMessage = driver.findElement(By.className("errortext"));

        String expectedErrorMessage = "Incorrect login or password";
        String actualErrorMessage = errorMessage.getText();

        if(actualErrorMessage.equals(expectedErrorMessage)){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }


    }
}