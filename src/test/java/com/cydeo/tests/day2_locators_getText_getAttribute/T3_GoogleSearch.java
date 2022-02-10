package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_GoogleSearch {
    public static void main(String[] args) {

        //1 Open a Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2 Open Google.com
        driver.get("https://www.google.com");

        //3 Write apple in search box
        WebElement googleSearchBox = driver.findElement(By.name("q"));

        //4 click google search button
        googleSearchBox.sendKeys("apple" + Keys.ENTER);

        //5 verify title expected title should start with "apple
        String expectedInTitle = "apple";
        String actualTitle = driver.getTitle();
        if(actualTitle.startsWith(expectedInTitle)){
            System.out.println("Title verification passed");
        }else{
            System.out.println("Title verification failed");
        }




    }

}
