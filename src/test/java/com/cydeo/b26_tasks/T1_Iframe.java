package com.cydeo.b26_tasks;

import com.cydeo.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/*
TC  #1: Iframe Task
1- Open a chrome browser
2- Go to:  https://login2.nextbasecrm.com/
3- Login Homepage ( Login with valid username and
password)
4- Click the MORE tab and select APPRECIATION
5- Write an Appreciation message
6- Click the SEND button
7- Verify the Appreciation message is displayed on
the feed
 */
public class T1_Iframe extends TestBase {

    @Test
    public void appreciationTest(){

        driver.get("https://login2.nextbasecrm.com/");

        String username = "helpdesk51@cybertekschool.com";
        String password = "UserUser";
        WebElement userLogin = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        WebElement passwordLogin = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
        userLogin.sendKeys(username);
        passwordLogin.sendKeys(password);
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        loginButton.click();

       WebElement moreTab = driver.findElement(By.xpath("//span[@id='feed-add-post-form-link-text']"));
       moreTab.click();
       driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       WebElement appreciationTab = driver.findElement(By.xpath("//span[@class='menu-popup-item menu-popup-no-icon feed-add-post-form-grat feed-add-post-form-grat-more ']//child::span[2]"));
        appreciationTab.click();

        driver.switchTo().frame(0);
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement appreciationTextBox = driver.findElement(By.xpath("//body[@contenteditable='true']"));
        appreciationTextBox.sendKeys("appreciation message test");
        driver.switchTo().parentFrame();
        //use this to switch to main HTML
        //driver.switchTo().defaultContent();

        WebElement sendButton = driver.findElement(By.xpath("//button[@class=\"ui-btn ui-btn-lg ui-btn-primary\"]"));
        sendButton.click();

        WebElement feedText = driver.findElement(By.xpath("//div[starts-with(@id, 'blog_post_body')]"));
        String actualText = feedText.getText();
        String expectedText = "appreciation message test";
        Assert.assertEquals(actualText, expectedText, "Feed message did not appear correctly!");

    }
}
