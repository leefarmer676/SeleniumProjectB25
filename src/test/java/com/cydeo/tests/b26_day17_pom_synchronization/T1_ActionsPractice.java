package com.cydeo.tests.b26_day17_pom_synchronization;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
/*
TC #1: Cydeo Practice Drag and Drop Test
1. Open a chrome browser
2. Go to:
https://practice.cydeo.com/drag_and_drop_circles
3. Click and hold small circle
4. Move it on top of the big circle
5. And release on it.
6. Verify “You did great!” text appears on big circle
 */
public class T1_ActionsPractice {

    @Test
    public void cydeo_practice_drag_and_drop_test(){
        Driver.getDriver().get("https://practice.cydeo.com/drag_and_drop_circles");

        WebElement smallCircle = Driver.getDriver().findElement(By.id("draggable"));
        WebElement bigCircle = Driver.getDriver().findElement(By.id("droptarget"));

        Actions actions = new Actions(Driver.getDriver());

        //actions.dragAndDrop(smallCircle, bigCircle).perform();
        actions.moveToElement(smallCircle).clickAndHold().moveToElement(bigCircle).release().perform();

        Assert.assertEquals(bigCircle.getText(), "You did great!");

    }

}
