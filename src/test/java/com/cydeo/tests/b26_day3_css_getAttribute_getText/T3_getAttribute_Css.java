package com.cydeo.tests.b26_day3_css_getAttribute_getText;

import com.cydeo.tests.b26_utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_getAttribute_Css {

    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //WebDriverManager.chromedriver().setup();
        //WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com");

        WebElement loginButton = driver.findElement(By.cssSelector("input[type='submit']"));

        //WebElement loginButton = driver.findElement(By.cssSelector("input[class='login-btn']"));

        String expectedText = "Log In";
        String actualText = loginButton.getAttribute("value");

        if(expectedText.equals(actualText)){
            System.out.println("worked");
        }else{
            System.out.println("didn't work");
        }

        driver.quit();


    }
}
