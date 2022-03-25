package com.cydeo.tests.day12_pom_design_explicit_wait;

import com.cydeo.pages.LibraryLoginPage;
import com.cydeo.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class POMPractice {

    LibraryLoginPage libraryLoginPage;

    @BeforeMethod
    public void setupMethod(){
        Driver.getDriver().get("https://library1.cydeo.com/");
        LibraryLoginPage libraryLoginPage = new LibraryLoginPage();
    }

    @Test
    public void required_field_error_message_test(){
        //open chrome browser
        //go to https://library1.cydeo.com/
        //Driver.getDriver().get("https://library1.cydeo.com/");

        //do not enter any informaiton
        //click sign in button
        //LibraryLoginPage libraryLoginPage = new LibraryLoginPage();
        libraryLoginPage.signInButton.click();

        //certify expected ereror is displays: "This field is required."
        Assert.assertTrue(libraryLoginPage.fieldRequiredErrorMessage.isDisplayed());
    }

    @Test
    public void invalid_email_format_error_message_test(){
       // Driver.getDriver().get("https://library1.cydeo.com/");

        //enter invalid email format
        //libraryLoginPage = new LibraryLoginPage();
        libraryLoginPage.inputUsername.sendKeys("Soemthingwrong");

        //verify expected error is displayed: "Please enter a valid email address"
        libraryLoginPage.signInButton.click();

        Assert.assertTrue(libraryLoginPage.enterValidEmailErrorMessage.isDisplayed());

        Driver.closeDriver();
    }

    @Test
    public void library_negative_login_test(){
        //TC#3: library negative login
    }
}
