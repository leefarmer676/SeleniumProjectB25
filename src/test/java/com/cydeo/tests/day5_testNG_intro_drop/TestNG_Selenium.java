package com.cydeo.tests.day5_testNG_intro_drop;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNG_Selenium {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        //maximize page
        driver.manage().window().maximize();

        //Implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void selenium_test(){
        //Do browser driver setup
        //driver = WebDriverFactory.getDriver("chrome");
        //Open browser
        //Get https://www.google.com
        driver.get("https://www.google.com");

        //Assert: title is "Google"
        Assert.assertEquals(driver.getTitle(), "Googl", "title is not matching here");
    }
    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }
}
