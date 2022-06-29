package com.cydeo.b26_tasks;

import com.cydeo.tests.b26_utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

/*
TC #1: Verifying “Simple dropdown” and “State selection”
dropdown default values
1. Open Chrome browser
2. Go to https://practice.cydeo.com/dropdown
3. Verify “Simple dropdown” default selected value is correct
Expected: “Please select an option”
4. Verify “State selection” default selected value is correct
Expected: “Select a State”

 */
public class Day7_Task1_SimpleDropDown {
    public static void main(String[] args) {


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com/dropdown");
        driver.manage().window().maximize();

        WebElement selectDropdown = driver.findElement(By.xpath("//select[@id='dropdown']/option[@selected='selected']"));
        //Select select1 = new Select(selectDropdown); //--this causes an exception
        String expectedText = "Please select an option";
        String actualText = selectDropdown.getText();
        Assert.assertEquals(expectedText, actualText);

        WebElement stateSelectionDropdown = driver.findElement(By.id("state"));
        Select selectobj = new Select(stateSelectionDropdown);
        selectobj.selectByVisibleText("Select a State");
        String expectedOutput = "Select a State";
        String actualOutput = selectobj.getFirstSelectedOption().getText();
        System.out.println(actualOutput);

    }
}
