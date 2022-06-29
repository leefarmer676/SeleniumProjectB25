package com.cydeo.b26_tasks;

import com.cydeo.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T3_WebTable_Order_Verify extends TestBase {

    @Test
    public void webTablePractice(){
        driver.get("https://practice.cydeo.com/web-tables ");

        WebElement bobMartinCell = driver.findElement(By.xpath("//table[@class='SampleTable']//td[.='Bob Martin']"));
        String actualName = bobMartinCell.getText();
        String expectedName = "Bob Martin";
        Assert.assertEquals(actualName, expectedName);

        WebElement bobMartinOrderDateCell = driver.findElement(By.xpath("//table[@class='SampleTable']//td[.='Bob Martin']//following-sibling::td[3]"));
        String actualDate = bobMartinOrderDateCell.getText();
        String expectedDate = "12/31/2021";
        Assert.assertEquals(actualDate, expectedDate);
    }

}
