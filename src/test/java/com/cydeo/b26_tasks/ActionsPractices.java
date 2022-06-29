package com.cydeo.b26_tasks;

import com.cydeo.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

/*
TC #4: Scroll practice
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/
3- Scroll down to “Powered by CYDEO”
4- Scroll using Actions class “moveTo(element)” method
TC #5: Scroll practice 2
1- Continue from where the Task 4 is left in the same test.
2- Scroll back up to “Home” link using PageUP button
 */
public class ActionsPractices extends TestBase {
    @Test
    public void actionsPractice(){
        driver.get("https://practice.cydeo.com/");

        WebElement poweredByCydeo = driver.findElement(By.linkText("CYDEO"));
        WebElement homeLink = driver.findElement(By.linkText("Home"));
        //System.out.println("homeLink.getText() = " + homeLink.getText());

        Actions actions = new Actions(driver);
        actions.moveToElement(poweredByCydeo).perform();
        actions.sendKeys(Keys.PAGE_UP).perform();
        actions.moveToElement(homeLink).perform();
    }
}
