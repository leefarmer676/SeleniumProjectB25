package com.cydeo.tests.b26_day17_pom_synchronization;

import com.cydeo.pagesb26.CydeoPracticePage;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
/*
TC #5: Cydeo Practice Drag and Drop Test
1. Open a chrome browser
2. Go to:
https://practice.cydeo.com/drag_and_drop_circles
3. Click and hold small circle
4. Dropped anywhere outside of big circle
5. Verify “Try again!” text appears on big circle
 */
public class TC5_TryAgainText {
    @Test
    public void tryAgain(){
        Driver.getDriver().get("https://practice.cydeo.com/drag_and_drop_circles");

        CydeoPracticePage cydeoPracticePage = new CydeoPracticePage();
        Actions actions = new Actions(Driver.getDriver());

        actions.clickAndHold(cydeoPracticePage.smallCircle).perform();
        actions.moveByOffset(100, 35).release().perform();

        Assert.assertEquals(cydeoPracticePage.bigCircle.getText(), "Try again!");
    }
}
