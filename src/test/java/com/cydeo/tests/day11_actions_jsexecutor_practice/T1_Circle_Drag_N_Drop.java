package com.cydeo.tests.day11_actions_jsexecutor_practice;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_Circle_Drag_N_Drop {

    @Test
    public void drag_and_drop_test() throws InterruptedException {
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        //drag and drop the smaller circle to the bigger circle
        WebElement acceptCookiesButton = Driver.getDriver().findElement(By.id("onetrust-accept-btn-handler"));
        acceptCookiesButton.click();

        WebElement smallCircle = Driver.getDriver().findElement(By.id("draggable"));

        WebElement largeCircle = Driver.getDriver().findElement(By.id("droptarget"));
        Thread.sleep(3000);
        Actions actions = new Actions(Driver.getDriver());
        //actions.dragAndDrop(smallCircle, largeCircle).perform();
        actions.clickAndHold(smallCircle).moveToElement(largeCircle).release().perform();

        //Assert text in big circle changed to "You did great!"
        String actualBigCircleText = largeCircle.getText();
        String expectedBigCircleText = "You did great!";
        Assert.assertEquals(actualBigCircleText, expectedBigCircleText);
    }


}
