package com.cydeo.tests.day12_pom_design_explicit_wait;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WebDriveWaitPractices {

    @Test
    public void
    dynamic_load_7_test(){
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/7");
        //creating wait object to be able to create certin condition to wait
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        //use the wait object to create our expected condition
        wait.until(ExpectedConditions.titleIs("Dynamic title"));

        //assert message "Done" is displayed




    }
}
