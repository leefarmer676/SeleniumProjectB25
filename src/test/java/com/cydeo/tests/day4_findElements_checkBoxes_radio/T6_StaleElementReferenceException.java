package com.cydeo.tests.day4_findElements_checkBoxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T6_StaleElementReferenceException {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/abtest");

        WebElement linkText = driver.findElement(By.xpath("//a[text()='CYDEO']"));
        //System.out.println("linkText.getText() = " + linkText.getText());

        System.out.println("linkText.isDisplayed() = " + linkText.isDisplayed());

        //refresh the page
        driver.navigate().refresh();

        //verify it is displayed, again
        //need to refresh teh web element reference by re-assigning(re-locating) the web element
        linkText = driver.findElement(By.xpath("//a[text()='CYDEO']"));
        System.out.println("linkText.isDisplayed() = " + linkText.isDisplayed());

        driver.close();

    }

}
