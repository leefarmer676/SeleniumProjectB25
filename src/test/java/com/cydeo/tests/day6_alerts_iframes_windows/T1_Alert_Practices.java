package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_Alert_Practices {

    public WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
    driver = WebDriverFactory.getDriver("chrome");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    driver.get("https://practice.cydeo.com/javascript_alerts");
    }

    @Test
    public void alert_test1() throws InterruptedException {
        WebElement informationAlertButton = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        Thread.sleep(3000);
        informationAlertButton.click();
        Thread.sleep(3000);
        //to be able to click to button on the alert, we need to switch the dirver's focus to Alert itself (would be looking at HtML otherwise)
        Alert alert = driver.switchTo().alert();

        //click ok button from alert - cannot locate alert button with 'inspect" bc it's not in HTML
        //so can only use the accept option or other options etc.
        alert.accept();

        //now driver is relocated back to looking at HTML

        //verify "you successfuly clicked on alert"text is displayed
        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));

        //failure message will only be displayed if assertion fails: "Result text is NOT displayed"
        Assert.assertTrue(resultText.isDisplayed(), "Result text is NOT displayed");

        String expectedText = "You successfully clicked an alert";

        String actualText = resultText.getText();

        Assert.assertEquals(expectedText, actualText, "Actual result test is not as expected!!!");

    }


}
