package com.cydeo.tests.b26_day17_pom_synchronization;

import com.cydeo.pagesb26.CydeoPracticePage;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

/*
TC #3: Cydeo Practice Drag and Drop Test
1. Open a chrome browser
     2.  Go to:
https://practice.cydeo.com/drag_and_drop_circles
3. Click and hold small circle
4. Verify "Drop here." text appears on big circle
 */
public class TC3_Cydeo_Practice_DragAndDropTest {

    @Test
    public void dragAndDrop(){
        Driver.getDriver().get("https://practice.cydeo.com/drag_and_drop_circles");

        CydeoPracticePage cydeoPracticePage = new CydeoPracticePage();
        Actions actions = new Actions(Driver.getDriver());

        actions.clickAndHold(cydeoPracticePage.smallCircle).perform();
        actions.moveByOffset(100, 15).perform();

        Assert.assertEquals(cydeoPracticePage.bigCircle.getText(), "Drop here.");

    }


}
