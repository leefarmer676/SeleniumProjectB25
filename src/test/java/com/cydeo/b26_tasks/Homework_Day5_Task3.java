package com.cydeo.b26_tasks;

import com.cydeo.tests.b26_utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*
Practice: Checkboxes
1. Go to http://practice.cydeo.com/checkboxes
2. Confirm checkbox #1 is NOT selected by default
3. Confirm checkbox #2 is SELECTED by default.
4. Click checkbox #1 to select it.
5. Click checkbox #2 to deselect it.
6. Confirm checkbox #1 is SELECTED.
7. Confirm checkbox #2 is NOT selected.
 */
public class Homework_Day5_Task3 {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cydeo.com/checkboxes");
        driver.manage().window().maximize();

        WebElement checkbox1 = driver.findElement(By.xpath("//input[@name='checkbox1']"));
        WebElement checkbox2 = driver.findElement(By.xpath("//input[@name='checkbox2']"));

        System.out.println("checkbox1.isSelected() = " + checkbox1.isSelected());
        System.out.println("checkbox2.isSelected() = " + checkbox2.isSelected());

        checkbox1.click();
        checkbox2.click();

        System.out.println("checkbox1.isSelected() = " + checkbox1.isSelected());
        System.out.println("checkbox2.isSelected() = " + checkbox2.isSelected());

    }
}
