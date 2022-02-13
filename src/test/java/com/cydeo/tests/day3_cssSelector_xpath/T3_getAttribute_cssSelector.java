package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_getAttribute_cssSelector {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/");

        //verify Login button is as expected: "Log In"
        //located using class attribute - third option not shown is using type attribute
        WebElement signInButton = driver.findElement(By.cssSelector("input[class='login-btn']"));
        //lovated using value attribute
        //WebElement signInButton = driver.findElement(By.cssSelector("input[value='Log In']"));

        String expectedButtonText = "Log In";
        String actualButtonText = signInButton.getAttribute("value");

        System.out.println("actualButtonText = " + actualButtonText);

        if(expectedButtonText.equals(actualButtonText)){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }

    }
}
