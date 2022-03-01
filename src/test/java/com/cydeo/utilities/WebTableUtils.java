package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTableUtils {

    public static String returnOrderDate(WebDriver driver, String customerName){
        String locator = "//td[.='" + customerName + "']/following-sibling::td[3]";

        WebElement customerDateCell = driver.findElement(By.xpath(locator));

        return customerDateCell.getText();
        //could put the above 3 lines into one line, but it's more readable and understandable this way
    }

    public static void orderVerify(WebDriver driver, String customerName, String expectedOrderDate){
        String locator = "//td[.='" + customerName + "']/following-sibling::td[3]";

        WebElement customerDateCell = driver.findElement(By.xpath(locator));

        String actualOrderDate = customerDateCell.getText();

        Assert.assertEquals(expectedOrderDate, actualOrderDate);

    }

    //create method to accept a customer name and return the customer order date as String

}
