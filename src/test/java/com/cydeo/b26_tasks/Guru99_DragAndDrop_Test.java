package com.cydeo.b26_tasks;

import com.cydeo.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/*
TC : Guru99 Drag and Drop Test
1- Open a chrome browser
2- Go to: https://demo.guru99.com/test/drag_drop.html
3- Drag “BANK” and drop into Account area under Debit
Side
4- Drag “5000” and drop into Amount area under Debit Side
5- Drag “SALES” and drop into Account area under Credit
Side
6- Drag “5000” and drop into Amount area under Credit
Side
7- Verify “Perfect!” text displayed.
 */
public class Guru99_DragAndDrop_Test extends TestBase {
    @Test
    public void dragAndDrop(){
        driver.get("https://demo.guru99.com/test/drag_drop.html");

        WebElement bankBtn = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
        WebElement btn5000 = driver.findElement(By.xpath("//a[text()=' 5000']"));
        WebElement salesBtn = driver.findElement(By.xpath("//a[text()=' SALES ']"));

        WebElement accountDebit = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
        WebElement amountDebit = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
        WebElement accountCredit = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
        WebElement amountCredit = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(bankBtn, accountDebit).perform();
        actions.dragAndDrop(btn5000, amountDebit).perform();
        actions.dragAndDrop(salesBtn, accountCredit).perform();
        actions.dragAndDrop(btn5000, amountCredit).perform();


        WebElement perfectText = driver.findElement(By.xpath("//a[@class=\"button button-green\"]"));
        String actualText = perfectText.getText();
        String expectedText = "Perfect!";
        assertEquals(actualText, expectedText);
        driver.close();
    }
}
