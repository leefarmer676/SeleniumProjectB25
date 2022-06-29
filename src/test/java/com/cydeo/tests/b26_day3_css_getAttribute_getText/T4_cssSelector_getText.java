package com.cydeo.tests.b26_day3_css_getAttribute_getText;

import com.cydeo.tests.b26_utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4_cssSelector_getText {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

        //verify reset password button
        WebElement resetPasswordButton = driver.findElement(By.cssSelector("button.login-btn"));
        String actualText = resetPasswordButton.getText();
        String expectedText = "Reset password";

        if(actualText.equals(expectedText)){
            System.out.println("Reset password button get text worked");
        }else{
            System.out.println("Reset password button get text didn't work");
        }

        driver.quit();

    }
}
