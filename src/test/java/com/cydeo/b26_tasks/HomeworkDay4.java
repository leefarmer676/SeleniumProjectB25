package com.cydeo.b26_tasks;

import com.cydeo.tests.b26_utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeworkDay4 {

    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cydeo.com/forgot_password ");
        driver.manage().window().maximize();
        //3. Enter any email into input box
        WebElement emailInputBox = driver.findElement(By.xpath("//input[@name='email']"));
        emailInputBox.sendKeys("lee.farmer0208@gmail.com");
        //4. Click on Retrieve password
        WebElement retrievePasswordButton = driver.findElement(By.xpath("//i[@class='icon-2x icon-signin']"));
        retrievePasswordButton.click();
        //5. Verify URL contains:
        //Expected: “email_sent”
        boolean actualURL = driver.getCurrentUrl().contains("email_sent");
        System.out.println("actualURL contains expected = " + actualURL);
        //6. Verify textbox displayed the content as expected.
        //Expected: “Your e-mail’s been sent!”
        WebElement TextOnScreen = driver.findElement(By.xpath("//h4[@name='confirmation_message']"));
        String textDisplayed = TextOnScreen.getText();
        System.out.println("textDisplayed = " + textDisplayed);
        String expectedText = "Your e-mail's been sent!";
        if(textDisplayed.equals(expectedText)){
            System.out.println("worked");


        }else{
            System.out.println("didn't work");
        }


    }

}
