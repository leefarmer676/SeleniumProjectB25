package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T2_Upload_Practice {

    @Test
    public void upload_test(){
        //go to website
        Driver.getDriver().get("https://practice.cydeo.com/upload");

        //find some small file from your computer, and get the path of it
        String path = "C:\\Users\\leefa\\Downloads\\Core_Java_Interview_Questions_2.docx";

        //upload the file
        WebElement fileUpload = Driver.getDriver().findElement(By.id("file-upload"));
        fileUpload.sendKeys(path);

        WebElement uploadButton = Driver.getDriver().findElement(By.id("file-submit"));
        uploadButton.click();

        //assert: file upload text is displayed on the page
        WebElement fileUploadedHeader = Driver.getDriver().findElement(By.tagName("h3"));
        Assert.assertTrue(fileUploadedHeader.isDisplayed());

    }


}
