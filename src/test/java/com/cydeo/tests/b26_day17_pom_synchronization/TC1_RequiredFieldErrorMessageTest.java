package com.cydeo.tests.b26_day17_pom_synchronization;

import com.cydeo.pagesb26.Library1Page;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

/*
TC #1: Required field error message test
1- Open a chrome browser
2- Go to: https://library1.cydeo.com
3- Do not enter any information
4- Click to “Sign in” button
5- Verify expected error is displayed:
Expected: This field is required.
NOTE: FOLLOW POM DESIGN PATTERN
 */
public class TC1_RequiredFieldErrorMessageTest {
    @Test
    public void requiredFieldErrorMessageTest(){
        Driver.getDriver().get("https://library1.cydeo.com");

        Library1Page library1Page = new Library1Page();
        Actions actions = new Actions(Driver.getDriver());

        library1Page.loginBtn.click();

        Assert.assertEquals(library1Page.errorMsg.getText(), "This field is required.");

    }

}
