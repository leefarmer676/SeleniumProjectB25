package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
    //creating a private constructor, so we are closing access to the obj of this class from outside the class
    private Driver(){

    }
    //only access we want to provide outside the class

    //static bc we will use it in a static method so it will run first
    private static WebDriver driver;
    //create a reusable utility method which will return name driver instance when we call it
    public static WebDriver getDriver(){
        if(driver==null){

            //get browser from configuration reader class
            //this way, we can control which browser is opened from outside our code
            String browserType = ConfigurationReader.getProperty("browser");

            switch (browserType){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;


            }
        }
        //if it's not null, it will return the existing driver
        return driver;
    }

    //this method will make sure our driver value is always null after using quit() method instead
    //of closing everythign down completely and we cannot use the driver method anymore

    public static void closeDriver(){
        if(driver != null){
            driver.quit();
            //noSuchSessionException when driver value is not null
            driver = null; //this will now say our driver is null after we close a session,
            //so that it will go through the above switch case and can assign us a browser again
        }
    }
}
