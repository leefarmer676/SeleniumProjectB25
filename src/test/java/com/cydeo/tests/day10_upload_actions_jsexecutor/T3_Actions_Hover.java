package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T3_Actions_Hover {

    @Test
    public void hovering_test (){
        Driver.getDriver().get("https://practice.cydeo.com/hovers");

        WebElement img1 = Driver.getDriver().findElement(By.xpath("(//img)[1]"));
        WebElement img2 = Driver.getDriver().findElement(By.xpath("(//img)[2]"));
        WebElement img3 = Driver.getDriver().findElement(By.xpath("(//img)[3]"));

        WebElement user1 = Driver.getDriver().findElement(By.xpath("//h5[text()='name: user1']"));
        WebElement user2 = Driver.getDriver().findElement(By.xpath("//h5[text()='name: user2']"));
        WebElement user3 = Driver.getDriver().findElement(By.xpath("//h5[text()='name: user3']"));

        Actions actions = new Actions(Driver.getDriver());

        //hover over to first image
        BrowserUtils.sleep(2);
        actions.moveToElement(img1).perform();

        //Assert "name: user1" is displayed
        Assert.assertTrue(user1.isDisplayed());

        //hover over to second image
        BrowserUtils.sleep(2);
        actions.moveToElement(img2).perform();

        Assert.assertTrue(user2.isDisplayed());

        //hover over ot third image
        BrowserUtils.sleep(2);
        actions.moveToElement(img3).perform();

        Assert.assertTrue(img3.isDisplayed());


    }
}
