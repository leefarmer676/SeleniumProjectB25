package com.cydeo.tests.day12_pom_design_explicit_wait;

import com.cydeo.pages.DynamicLoad1Page;
import com.cydeo.pages.DynamicLoad7Page;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
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

        //create object of DynamicLoad7Page ot reach adn assert web elements
        DynamicLoad7Page dynamicLoad7Page = new DynamicLoad7Page();

        //assert message "Done" is displayed
        Assert.assertTrue(dynamicLoad7Page.doneMessage.isDisplayed());

        Assert.assertTrue(dynamicLoad7Page.spongeBobImage.isDisplayed());



    }

    @Test

    public void dynamic_load_1_test(){
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/1");
        DynamicLoad1Page dynamicLoad1Page = new DynamicLoad1Page();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        //click to start
        dynamicLoad1Page.startButton.click();

        //wait until loading bar disappears
        wait.until(ExpectedConditions.invisibilityOf(dynamicLoad1Page.loadingBar));

        //assert username input box is displayed
        Assert.assertTrue(dynamicLoad1Page.inputUsername.isDisplayed());

        //enter username: tom smith
        dynamicLoad1Page.inputUsername.sendKeys("tomsmith");

        //enter password: incorrect passowrd
        dynamicLoad1Page.inputPassword.sendKeys("incorrectpassword");

        //click submit button
        dynamicLoad1Page.submitButton.click();

        //assert "Your password is invalid!" text is displayed
        Assert.assertTrue(dynamicLoad1Page.errorMessage.isDisplayed());
    }
}
