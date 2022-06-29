package com.cydeo.b26_tasks;

import com.cydeo.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

/*
1. Go to  “http://demo.guru99.com/test/upload”
2. Upload file into Choose File
3. Click terms of servide check box
4. Click Submit File button
5. Verify expected message appeared. Expected: “1 file
has been successfully uploaded.”
 */
public class Guru99_UploadTest extends TestBase {
@Test
    public void guru99(){
        driver.get("http://demo.guru99.com/test/upload");

        String filePath = "C:\\Users\\leefa\\OneDrive\\Desktop\\Screenshots VyTrack\\Sales Manager  Login Screen.png";
        WebElement uploadFileBtn = driver.findElement(By.id("uploadfile_0"));
        uploadFileBtn.sendKeys(filePath);

        WebElement acceptCheckBox = driver.findElement(By.id("terms"));
        acceptCheckBox.click();

        WebElement submitBtn = driver.findElement(By.id("submitbutton"));
        submitBtn.click();
    }

}
