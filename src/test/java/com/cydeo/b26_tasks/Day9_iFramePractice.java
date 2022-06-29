package com.cydeo.b26_tasks;

import com.cydeo.tests.b26_utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/*
TC #6: Iframe Task
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/iframe
3- Clear text from comment body
4- Type "Hello World" in comment body
5- Verify "Hello World" text is written in comment body
6- Verify header "An iFrame containing the TinyMCE
WYSIWYG Editor" is displayed
 */
public class Day9_iFramePractice {
    public WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/iframe");
    }

    @Test
    public void iframeTask() throws InterruptedException{

        driver.switchTo().frame(0);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement textBox = driver.findElement(By.xpath("//p[.='Your content goes here.']"));
        textBox.clear();
        textBox.sendKeys("Hello World");
        textBox = driver.findElement(By.xpath("//p[.='Hello World']"));
        System.out.println("textBox.getText() = " + textBox.getText());
        //5- Verify "Hello World" text is written in comment body
        String actualText = textBox.getText();
        String expectedText = "Hello World";
        Assert.assertEquals(actualText, expectedText);
        //6- Verify header "An iFrame containing the TinyMCE
        //WYSIWYG Editor" is displayed
        driver.switchTo().parentFrame();
        WebElement header = driver.findElement(By.xpath("//h3[.='An iFrame containing the TinyMCE WYSIWYG Editor']"));
        Assert.assertTrue(header.isDisplayed());

    }
}
