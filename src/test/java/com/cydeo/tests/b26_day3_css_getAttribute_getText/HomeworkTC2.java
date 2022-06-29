package com.cydeo.tests.b26_day3_css_getAttribute_getText;

import com.cydeo.tests.b26_utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeworkTC2 {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/");

        //verify remember me label text is as expected: "Remember me on this computer"
        WebElement rememberMeLabel = driver.findElement(By.cssSelector("label.login-item-checkbox-label"));
        String expectedRememberMeText = "Remember me on this computer";
        String actualRememberMeText = rememberMeLabel.getText();

        if(expectedRememberMeText.equals(actualRememberMeText)){
            System.out.println("remember me text is correct");
        }else{
            System.out.println("remember me text is incorrect");
        }

        //verify forgot password link text is as expected: "Forgot your password?"
        WebElement forgotPasswordLink = driver.findElement(By.cssSelector("a.login-link-forgot-pass"));
        String actualForgotPasswordText = forgotPasswordLink.getText();
        System.out.println("actual forgot password text: " + actualForgotPasswordText);
        String expectedForgotPasswordText = "Forgot your password?";
        System.out.println("expected forgot password text: " + expectedForgotPasswordText);

        if(actualForgotPasswordText.equalsIgnoreCase(expectedForgotPasswordText)){
            System.out.println("forgot password text is right");
        }else{
            System.out.println("forgot password text is not as expected");
        }

        //Verify “forgot password” href attribute’s value contains expected:
        //Expected: "forgot_password=yes"

        WebElement actualForgotPasswordHref = driver.findElement(By.cssSelector("a[href='/?forgot_password=yes']"));
        String actualForgotPasswordHrefText = actualForgotPasswordHref.getAttribute("href");
        String expectedForgotPasswordHref = "forgot_password=yes";

        if(actualForgotPasswordHrefText.contains(expectedForgotPasswordHref)){
            System.out.println("href value contains expected");
        }else{
            System.out.println("href value doesn't contain expected");
        }


        driver.quit();
    }
}
