package com.cydeo.tests.b26_day17_pom_synchronization;

import com.cydeo.pagesb26.CydeoPracticePage;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

/*
TC #2: Cydeo Practice Drag and Drop Test
1. Open a chrome browser
2. Go to:
https://practice.cydeo.com/drag_and_drop_circles
3. Verify expected default text appears on big circle
   Expected = "Drag the small circle here."
 */
public class POM_ActionsPractice {
    @Test
    public void dragSmallCircleHere() {
        Driver.getDriver().get("https://practice.cydeo.com/drag_and_drop_circles");

        CydeoPracticePage cydeoPracticePage = new CydeoPracticePage();

        Assert.assertEquals(cydeoPracticePage.bigCircle.getText(), "Drag the small circle here.");

    }
    @Test
    public void drop_here_text(){
        Driver.getDriver().get("https://practice.cydeo.com/drag_and_drop_circles");

        CydeoPracticePage cydeoPracticePage = new CydeoPracticePage();
        //click and hold small circle

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(cydeoPracticePage.smallCircle).clickAndHold()
                .pause(2000).moveByOffset(100, 0)
                .pause(2000).perform();

        //verify "Drop here." text appears on big circle
        Assert.assertEquals(cydeoPracticePage.bigCircle.getText(), "Drop here.");

        }

}
