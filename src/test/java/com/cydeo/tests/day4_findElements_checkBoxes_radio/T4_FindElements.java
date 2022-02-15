package com.cydeo.tests.day4_findElements_checkBoxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T4_FindElements {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/abtest");

        //locate all the links on the page
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));

        //print out the number of the links on teh page
        System.out.println("allLinks.size() = " + allLinks.size());

        //print out the texts of the links
        for (WebElement each : allLinks) {
            System.out.println("text of the links: " + each.getText());
            System.out.println("HREF values: " + each.getAttribute("href"));
        }

        //print out the href attribute values of the links -> added into the same for loop above


    }
}
