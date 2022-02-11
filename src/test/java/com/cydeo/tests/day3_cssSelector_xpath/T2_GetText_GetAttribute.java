package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_GetText_GetAttribute {

    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/");

        //verify "remember me" label text is as expected:
        //expected: Remember me on this computer
        WebElement rememberMeText = driver.findElement(By.className("login-item-checkbox-label"));
        String expectedRememberMeText = "Remember me on this computer";
        String actualRememberMeText = rememberMeText.getText();

        if(expectedRememberMeText.equals(actualRememberMeText)){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }

        //verify "forgot password" link text is as expected
        //expected: Forgot your password?
        WebElement forgotPasswordText = driver.findElement(By.className("login-link-forgot-pass"));
        String expectedForgotPasswordText = "Forgot your password?";
        String actualForgotPasswordText = forgotPasswordText.getText();

        if(expectedForgotPasswordText.equals(actualForgotPasswordText)){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }

        //verify "forgot password" href attribute's value contains expected:
        //forgot_password=yes
        String expectedInHref = "forgot_password=yes";
        String actualHrefAttributeValue = forgotPasswordText.getAttribute("href");

        System.out.println("actualHrefAttributeValue = " + actualHrefAttributeValue);

        if(actualHrefAttributeValue.contains(expectedInHref)){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }


    }
}
