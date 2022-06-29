package com.cydeo.b26_tasks;

import com.cydeo.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

/*
TC #2 Upload Test
1. Go to https://practice.cydeo.com/upload
2. Find some small file from your computer, and get the path of it.
3. Upload the file.
4. Assert:
-File uploaded text is displayed on the page
 */
public class HW_Upload_Practice extends TestBase {
    @Test
    public void uploadPractice(){
        driver.get("https://practice.cydeo.com/upload");
        String filePath = "C:\\Users\\leefa\\OneDrive\\Desktop\\Flipgrid question how to test a vending machine.txt";
        WebElement chooseFileBtn = driver.findElement(By.id("file-upload"));
        chooseFileBtn.sendKeys(filePath);

        WebElement uploadBtn = driver.findElement(By.id("file-submit"));
        uploadBtn.click();

        String ExpectedSuccessMsg = "File Uploaded!";
        String actualSuccessMsg = driver.findElement(By.xpath("//h3")).getText();
        assertEquals(ExpectedSuccessMsg, actualSuccessMsg);
    }
}
