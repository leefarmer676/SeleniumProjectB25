package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_getText_getAttribute {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/registration_form");

        //verify header text is as excpected
        WebElement headerText = driver.findElement(By.tagName("h2"));
        //stored in web element since this returns a web element, not string

        //expected: registration form
        String expectedHeaderText = "Registration form";
        String actualHeaderText = headerText.getText();

        if(actualHeaderText.equals(expectedHeaderText)){
            System.out.println("Passed");
        }else{
            System.out.println("failed");
        }

        //locate "First name" input box
        //we are locating the web element using "name" locator
        //name attribute has "firstname" value
        //WebElement firstNameBox = driver.findElement(By.name("firstname"));
        WebElement firstNameBox = driver.findElement(By.className("form-control")); //second way

        String expectedPlaceHolder = "first name";
        String actualPlaceHolder = firstNameBox.getAttribute("placeholder");
        if(expectedPlaceHolder.equals(actualPlaceHolder)){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }
        driver.close();



    }

}
