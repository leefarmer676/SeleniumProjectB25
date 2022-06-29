package com.cydeo.b26_tasks;

import com.cydeo.tests.b26_utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/*
TC #3: Selecting value from multiple select dropdown
1. Open Chrome browser
2. Go to https://practice.cydeo.com/dropdown
3. Select all the options from multiple select dropdown.
4. Print out all selected values.
5. Deselect all values.
 */
public class Day7_Task3_MultiSelect_DropDown {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com/dropdown");
        driver.manage().window().maximize();

        WebElement multiItemDropdown = driver.findElement(By.name("Languages"));
        Select multiItemSelect = new Select(multiItemDropdown);
        System.out.println("multiItemSelect.isMultiple() = " + multiItemSelect.isMultiple());
        multiItemSelect.selectByIndex(0);
        multiItemSelect.selectByValue("js");
        multiItemSelect.selectByVisibleText("C#");
        multiItemSelect.selectByIndex(3);
        multiItemSelect.selectByIndex(4);
        multiItemSelect.selectByIndex(5);


        multiItemSelect.deselectByIndex(0);
        multiItemSelect.deselectAll();


    }
}
