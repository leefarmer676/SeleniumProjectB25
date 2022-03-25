package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class T1_Registration_Form {
    @Test
    public void registration_form_test(){
        //open browser
        //go to website
        //Driver.getDriver() --> driver.geturl
        Driver.getDriver().get(ConfigurationReader.getProperty("registration.form.url"));
        //create Java Faker object
        Faker faker = new Faker();

        //enter first name
        WebElement inputFirstName = Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
        inputFirstName.sendKeys(faker.name().firstName());

        //enter last name
        WebElement inputLastName = Driver.getDriver().findElement(By.xpath("//input[@name='lastname']"));
        inputLastName.sendKeys(faker.name().lastName());

        //enter username
        WebElement inputUsername = Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
        String user = faker.bothify("helpdesk####");
        //did above bc username faker uses a dot and the webpage cannot accept a dot
        //other option is to use bothify "helpdesk####"
        inputUsername.sendKeys(user);

        //enter email address
        WebElement inputEmail = Driver.getDriver().findElement(By.xpath("//input[@name='email']"));
        inputEmail.sendKeys(user+"@email.com");
        //used above to concate it to make sure it is in email format

        //enter password
        WebElement inputPassword = Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
        inputPassword.sendKeys(faker.numerify("#########"));

        //enter phone numberr
        WebElement inputPhoneNumber = Driver.getDriver().findElement(By.xpath("//input[@name='phone']"));
        inputPhoneNumber.sendKeys(faker.numerify("###-###-####"));

        //select gender from radio buttons
        WebElement inputGender = Driver.getDriver().findElement(By.xpath("//input[@value='female']"));
        inputGender.click();

        //enter date of birth
        WebElement inputBirthdate = Driver.getDriver().findElement(By.xpath("//input[@name='birthday']"));
        inputBirthdate.sendKeys("03/08/2000");
        //faker.number().numberBetween(1,12)

        //select dept/office
        Select departmentDropdown = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='department']")));
        departmentDropdown.selectByIndex(faker.number().numberBetween(1,9));

        //select job title
        Select jobTitleDropdown = new Select(Driver.getDriver().findElement(By.xpath("//")));


    }
}
