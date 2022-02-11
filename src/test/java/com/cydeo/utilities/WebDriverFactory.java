package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {

    public static WebDriver getDriver(String browserType){
        if(browserType.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver(); //don't have to store in a variable, "driver"
            //WebDriver driver = new ChromeDriver();
            //driver.manage().window().maximize();
        }else if(browserType.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        }else{
            System.out.println("Given browser type is not supported");
            System.out.println("Driver = null");
            return null;
        }
    }

    public static void main(String[] args) { //static so we don't have to create an object
        getDriver("chrome");
    }
}
