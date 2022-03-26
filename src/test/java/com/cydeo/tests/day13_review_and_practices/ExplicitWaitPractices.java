package com.cydeo.tests.day13_review_and_practices;

import com.cydeo.pages.ExplicitWaitPage;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class ExplicitWaitPractices {
    ExplicitWaitPage explicitWaitPage;

    @BeforeMethod
    public void setupMethod() {
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_controls");
        explicitWaitPage = new ExplicitWaitPage();
    }

    @Test
    public void remove_button_test() {

        Actions actions = new Actions(Driver.getDriver());
        WebDriverWait webDriverWait = new WebDriverWait(Driver.getDriver(), 10);

        //click remove button
        explicitWaitPage.removeButton.click();

        //wait until "loading bar disappears"
        Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        //turning off the implicit wait set up in the Driver class
        boolean result = explicitWaitPage.loadingBar.isDisplayed();
        // System.out.println("result = " + result);
        webDriverWait.until(ExpectedConditions.invisibilityOf(explicitWaitPage.loadingBar));

        //verify: checkbox is not displayed
        try {
            Assert.assertFalse(explicitWaitPage.checkBox.isDisplayed());


        } catch (NoSuchElementException n) {
            Assert.assertTrue(true);
        }

        //then verify "It's gone!" message is displayed
        Assert.assertTrue(explicitWaitPage.itsGoneMessage.isDisplayed());
    }
}
