package com.cydeo.b26_tasks;

import com.cydeo.tests.b26_utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homework_Day6_Task1 {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.etsy.com");
        driver.manage().window().maximize();

        WebElement searchBox = driver.findElement(By.xpath("//input[@id='global-enhancements-search-query']"));
        searchBox.sendKeys("wooden spoon");

        WebElement magnifyGlass = driver.findElement(By.xpath("//span[@class='wt-icon wt-nudge-b-2 wt-nudge-r-1']/.."));
        magnifyGlass.click();

        WebElement filtersButton = driver.findElement(By.xpath("//span[@class='wt-hide-xs wt-show-md filter-expander']"));
        filtersButton.click();

        WebElement freeShippingCheckBox = driver.findElement(By.xpath("//label[@for='special-offers-free-shipping']"));
        freeShippingCheckBox.click();

        WebElement onSaleCheckBox = driver.findElement(By.xpath("//label[@for='special-offers-on-sale']"));
        onSaleCheckBox.click();

        WebElement under25Button = driver.findElement(By.xpath("//label[@for='price-input-1']"));
        under25Button.click();

        WebElement applyFilters = driver.findElement(By.xpath("//button[@class='wt-btn wt-btn--primary wt-width-full wt-mt-xs-3 wt-mb-xs-3 wt-mr-xs-3']"));
        applyFilters.click();

        WebElement printResultNumber = driver.findElement(By.cssSelector("span[class='wt-display-inline-flex-sm']>span"));
        System.out.println(printResultNumber.getText());
        //css selector child syntax
        // tagName[attribute='value'] > childTagName

    }
}
