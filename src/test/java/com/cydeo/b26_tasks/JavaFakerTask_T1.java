package com.cydeo.b26_tasks;

import com.cydeo.tests.base.TestBase;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;

public class JavaFakerTask_T1 extends TestBase {
    @Test
    public void javaFaker(){
        driver.get("https://practice.cydeo.com/registration_form");

        Faker javaFaker = new Faker();

        WebElement firstNameInputBox = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstNameInputBox.sendKeys(javaFaker.name().firstName());

        WebElement lastNameInputBox = driver.findElement(By.xpath("//input[@name='lastname']"));
        lastNameInputBox.sendKeys(javaFaker.name().lastName());

        WebElement usernameInputBox = driver.findElement(By.xpath("//input[@name='username']"));
        usernameInputBox.sendKeys(javaFaker.bothify("##??#??#?#?#?#?#?#?#?#####????"));

        WebElement emailAddressInputBox = driver.findElement(By.xpath("//input[@name='email']"));
        emailAddressInputBox.sendKeys(javaFaker.internet().emailAddress());

        WebElement passwordInputBox = driver.findElement(By.xpath("//input[@name='password']"));
        passwordInputBox.sendKeys(javaFaker.internet().password(8,100));

        WebElement phoneInputBox = driver.findElement(By.xpath("//input[@name='phone']"));
        phoneInputBox.sendKeys(javaFaker.numerify("###-###-####"));

        WebElement genderRadioButton = driver.findElement(By.xpath("//input[@value='other']"));
        genderRadioButton.click();

        WebElement dateOfBirthInputBox = driver.findElement(By.xpath("//input[@name='birthday']"));
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        String dob = sdf.format(javaFaker.date().birthday());
        dateOfBirthInputBox.sendKeys(dob);

        WebElement dropDown = driver.findElement(By.xpath("//select[@name='department']"));

        Select selectObj = new Select(dropDown);
        selectObj.selectByValue("MCR");

        WebElement jobTitleDropDown = driver.findElement(By.xpath("//select[@name='job_title']"));
        Select jobTitleSelect = new Select(jobTitleDropDown);
        jobTitleSelect.selectByIndex(1);

        WebElement progLangCheckBox = driver.findElement(By.xpath("//input[@value='java']"));
        progLangCheckBox.click();

        WebElement signUpBtn = driver.findElement(By.id("wooden_spoon"));
        signUpBtn.click();
/*
15. Verify success message “You’ve successfully completed registration.” is
displayed.
 */
       // WebElement successMessage = driver.findElement(By.cssSelector("class alert-heading"));
        //System.out.println(successMessage.getText());
    }
}
