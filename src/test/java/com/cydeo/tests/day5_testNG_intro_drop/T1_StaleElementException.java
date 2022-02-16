package com.cydeo.tests.day5_testNG_intro_drop;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T1_StaleElementException {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/add_remove_elements/");

        //click to "add element" button
        WebElement addElementBtn = driver.findElement(By.xpath("//button[.='Add Element']"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        addElementBtn.click();

        //verify "delete" button is displayed after clicking
        WebElement deleteButton = driver.findElement(By.xpath("//button[@class = 'added-manually']"));
        System.out.println("deleteButton.isDisplayed() = " + deleteButton.isDisplayed());

        //click to "delete button
        deleteButton.click();

        //verify "delete button is not displayed after clicking
        try {
            System.out.println("deleteButton.isDisplayed() = " + deleteButton.isDisplayed());
        }catch(StaleElementReferenceException e){
            System.out.println("StaleElementReferenceException is thrown");
            System.out.println("This means the web element is completely deleted from the page");
            System.out.println("deleteButton.isDisplayed() = false");
        }
        driver.close();
        //use xpath for all elements
    }
}
