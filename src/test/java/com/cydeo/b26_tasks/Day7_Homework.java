package com.cydeo.b26_tasks;

import com.cydeo.tests.b26_utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
TC : Selecting date on dropdown and verifying
1. Open Chrome browser
2. Go to https://practice.cydeo.com/dropdown
3. Select “December 1st, 1923” and verify it is selected.
 Select year using   : visible text
Select month using    : value attribute Select
day using : index number

 */
public class Day7_Homework {

    public WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com/dropdown");
        driver.manage().window().maximize();
    }

    @Test
    public void dropDownTask6() {
        WebElement dateDropDown = driver.findElement(By.id("year"));
        Select year = new Select(dateDropDown);
        year.selectByVisibleText("1923");
        WebElement monthDropDown = driver.findElement(By.id("month"));
        Select month = new Select(monthDropDown);
        month.selectByValue("11");
        WebElement dayDropDown = driver.findElement(By.id("day"));
        Select day = new Select(dayDropDown);
        day.selectByIndex(0);

        String expectedYear = "1923";
        String expectedMonth = "December";
        String expectedDay = "1";

        String actualYear = year.getFirstSelectedOption().getText();
        String actualMonth = month.getFirstSelectedOption().getText();
        String actualDay = day.getFirstSelectedOption().getText();

        Assert.assertTrue(actualYear.equals(expectedYear));
        Assert.assertTrue(actualMonth.equals(expectedMonth));
        Assert.assertTrue(actualDay.equals(expectedDay));

    }
    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }
}

