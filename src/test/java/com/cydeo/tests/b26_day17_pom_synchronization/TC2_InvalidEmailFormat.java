package com.cydeo.tests.b26_day17_pom_synchronization;

import com.cydeo.pagesb26.Library1Page;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;

/*
1- Open a chrome browser
2- Go to: https://library1.cydeo.com
3- Enter invalid email format
4- Verify expected error is displayed:
Expected: Please enter a valid email address.
 */
public class TC2_InvalidEmailFormat {
    @Test
    public void invalidEmailFormat(){
        Driver.getDriver().get("https://library1.cydeo.com");

        Faker faker = new Faker();

        Library1Page library1Page = new Library1Page();

        library1Page.emailAddressInput.sendKeys(faker.name().username());
        library1Page.loginBtn.click();

        Assert.assertEquals(library1Page.errorMsg.getText(), "Please enter a valid email address.");

    }
    @Test
    public void libraryNegativeLogin(){
        Driver.getDriver().get("https://library1.cydeo.com");
        Library1Page library1Page = new Library1Page();
        library1Page.emailAddressInput.sendKeys("iskldfjiawlef");
        library1Page.loginBtn.click();

        Assert.assertFalse(library1Page.errorMsg.getText().equals("Sorry, Wrong Email or Password"));


    }
}
