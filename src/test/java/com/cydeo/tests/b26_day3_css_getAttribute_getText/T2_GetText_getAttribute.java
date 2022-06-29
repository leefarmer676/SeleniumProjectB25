package com.cydeo.tests.b26_day3_css_getAttribute_getText;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_GetText_getAttribute {
    private static WebDriver driver;

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/registration_form");

        WebElement headerText = driver.findElement(By.tagName("h2"));
        String expectedHeader = "Registration form";
        String actualHeader = headerText.getText();

        if(actualHeader.equals(expectedHeader)){
            System.out.println("Successful header text");
        }else{
            System.out.println("failed header text");
        }

        WebElement firstNameInputBox = driver.findElement(By.className("form-control"));
        String expectedPlaceholder = "first name";
        //getAttribute() method is helping us get value of attribute
        String actualPlaceholder = firstNameInputBox.getAttribute("placeholder");

        if(actualPlaceholder.equals(expectedPlaceholder)){
            System.out.println("success");
        }else{
            System.out.println("failed");
        }
    }
}
