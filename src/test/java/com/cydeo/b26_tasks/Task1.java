package com.cydeo.b26_tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
1- Open a chrome browser
	2- Go to: https://practice.cydeo.com/
	3- Click to Multiple Buttons   (by using linkText locator)
	4- Verify title equals:
	   Expected: Multiple Buttons
	5- Go back to home page by using the .back();
	6- Verify title equals:
	   Expected: Practice

 */
public class Task1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.cydeo.com/");

        //WebElement ABTestingButton = driver.findElement(By.linkText("A/B Testing"));
        //ABTestingButton.click();

        WebElement MultipleButtonsButton = driver.findElement(By.linkText("Multiple Buttons"));
        MultipleButtonsButton.click();

        driver.navigate().back();

        String actualTitle = driver.getTitle();
        String expectedTitle = "Practice";

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Successful");
        }else{
            System.out.println("Didn't work");
        }
    }
}
