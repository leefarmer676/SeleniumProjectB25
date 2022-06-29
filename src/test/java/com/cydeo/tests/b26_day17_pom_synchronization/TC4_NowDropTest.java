package com.cydeo.tests.b26_day17_pom_synchronization;

import com.cydeo.pagesb26.CydeoPracticePage;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
/*
TC #4: Cydeo Practice Drag and Drop Test
7. Open a chrome browser
8. Go to:
https://practice.cydeo.com/drag_and_drop_circles
9. Click and hold small circle
10. Move it on top of the big circle
11. Verify “Now drop...” text appears on big circle
 */
public class TC4_NowDropTest {
    @Test
    public void nowDropTest(){
        Driver.getDriver().get("https://practice.cydeo.com/drag_and_drop_circles");

        CydeoPracticePage cydeoPracticePage = new CydeoPracticePage();
        Actions actions = new Actions(Driver.getDriver());

        actions.clickAndHold(cydeoPracticePage.smallCircle).perform();
        actions.moveToElement(cydeoPracticePage.bigCircle).perform();

        Assert.assertEquals(cydeoPracticePage.bigCircle.getText(), "Now drop...");
    }
}
