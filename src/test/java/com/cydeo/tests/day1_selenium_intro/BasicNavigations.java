package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {

        //1 set up the browser driver
        WebDriverManager.chromedriver().setup();

        //2 create instance of the Selenium WebDriver
        WebDriver driver = new ChromeDriver();

        //3 test to see if it's working
        driver.get("https://tesla.com");
        driver.get("https://www.facebook.com");

        //stop code execution for 3 seconds
       // Thread.sleep(3000);

        // use selenium to navigate back
        driver.navigate().back();

        //stop code execution for 3 seconds
        Thread.sleep(3000);

        //use selenium to navigate forward
        driver.navigate().forward();

        //stop code execution for 3 seconds
        Thread.sleep(3000);

        //use selenium to navigate refresh
        driver.navigate().refresh();

        //stop code execution for 1 seconds
        Thread.sleep(1000);

        //use navigate to go to a different page
        driver.navigate().to("https://www.google.com");



       driver.close();


    }


}
