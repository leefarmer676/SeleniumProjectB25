package com.cydeo.b26_tasks;

import com.cydeo.tests.b26_utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*
TC #4: FindElements Task
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/abtest
3- Locate all the links in the page.
4- Print out the number of the links on the page.
5- Print out the texts of the links.
6- Print out the HREF attribute values of the links

 */
public class Homework_Day5_Task2 {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com/abtest");
        driver.manage().window().maximize();

        WebElement homeLink = driver.findElement(By.className("nav-link"));
        WebElement cydeoLink = driver.findElement(By.xpath("//a[.='CYDEO']"));

        System.out.println("homeLink.getText() = " + homeLink.getText());
        System.out.println("cydeoLink.getText() = " + cydeoLink.getText());

        System.out.println("homeLink.getAttribute(\"href\") = " + homeLink.getAttribute("href"));
        System.out.println("cydeoLink.getAttribute(\"href\") = " + cydeoLink.getAttribute("href"));

        driver.close();
    }
}
