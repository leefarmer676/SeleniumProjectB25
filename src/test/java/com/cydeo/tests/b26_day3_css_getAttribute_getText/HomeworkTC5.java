package com.cydeo.tests.b26_day3_css_getAttribute_getText;

import com.cydeo.tests.b26_utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeworkTC5 {
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://www.everyoneisgay.com");

        WebElement searchBar = driver.findElement(By.cssSelector("input.search-field"));
        searchBar.click();
        searchBar.sendKeys("gay");
        System.out.println("search bar typed gay");

        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(3000);

        WebElement magnifyGlass = driver.findElement(By.cssSelector("input.search-submit"));
        magnifyGlass.click();

        Thread.sleep(3000);

        driver.navigate().back();

        searchBar.sendKeys("trans kids");
        magnifyGlass.click();

        Thread.sleep(3000);
    }
}
