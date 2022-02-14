package com.cydeo.tests.day4_findElements_checkBoxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_xpath_cssSelector_practice {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/forgot_password");

        ///locate all webelements on the page using xpath and or css locator only (total of 6)

        //a. "home" link
        WebElement homeLink_1 = driver.findElement(By.cssSelector("a[class='nav-link']"));
        WebElement homeLink_2 = driver.findElement(By.cssSelector("a.nav-link"));
        WebElement homeLink_3 = driver.findElement(By.cssSelector("a[href='/']"));

        //b. "forgot password" header
        WebElement header_1 = driver.findElement(By.cssSelector("div.example>h2"));
        WebElement header_2 = driver.findElement(By.xpath("//h2[text()='Forgot Password']"));

        //c. "e-mail" text
        //d. email input box
        //e. "retrieve passowrd button
        //f. "powered by cydeo text

        //4 verify all web elements
    }
}
