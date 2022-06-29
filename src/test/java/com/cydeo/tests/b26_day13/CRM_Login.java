package com.cydeo.tests.b26_day13;

import com.cydeo.tests.b26_utilities.WebDriverFactory;
import com.cydeo.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CRM_Login {
    public static WebDriver driver;
    @Test
    public static void crm_login(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.get(ConfigurationReader.getProperty("env"));

        WebElement userNameLogin = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        userNameLogin.sendKeys(ConfigurationReader.getProperty("username"));

        WebElement passwordLogin = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        passwordLogin.sendKeys(ConfigurationReader.getProperty("password"));

        WebElement loginBtn = driver.findElement(By.xpath("//input[@class='login-btn']"));
        loginBtn.click();

        String expectedTitle = "Portal";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(expectedTitle, actualTitle);
    }
}
