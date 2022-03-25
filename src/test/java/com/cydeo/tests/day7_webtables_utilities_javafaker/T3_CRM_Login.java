package com.cydeo.tests.day7_webtables_utilities_javafaker;

import com.cydeo.tests.base.TestBase;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.CRM_Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T3_CRM_Login extends TestBase {

    @Test
    public void crm_login_test(){
        driver.get("https://login1.nextbasecrm.com/");

        //enter valid username
        WebElement inputUsername = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputUsername.sendKeys("helpdesk1@cybertekschool.com");

        //enter valid password
        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        inputPassword.sendKeys("UserUser");

        //click login
        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginButton.click();

        //Verify title is as expected
        //Expected: Portal
        BrowserUtils.verifyTitle(driver, "Portal");

    }
    @Test
    public void crm_login_test_2(){
        driver.get("https://login1.nextbasecrm.com/");

        CRM_Utilities.crm_login(driver);

        //Verify title is as expected
        //Expected: Portal
        BrowserUtils.verifyTitle(driver, "Portal");

    }
    @Test
    public void crm_login_test_3(){
        driver.get("https://login1.nextbasecrm.com/");

        CRM_Utilities.crm_login(driver, "helpdesk2@cybertekschool.com", "UserUser");

        //Verify title is as expected
        //Expected: Portal
        BrowserUtils.verifyTitle(driver, "Portal");

    }
}
