package com.cydeo.tests.day5_testNG_intro_drop;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T3_RadioButton {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/radio_buttons");

        WebElement hockeyRadioBtn = driver.findElement(By.xpath("//input[@id='hockey']"));

        //locate name = 'sports' radio buttons and store them in a list of web element
        List<WebElement> sportRadioButtons = driver.findElements(By.name("sport"));

        //loop through the list of web element and select matching result 'hockey'

        clickAndVerifyRadioButton(driver, "sport", "hockey");

        clickAndVerifyRadioButton(driver, "sport", "football");

        clickAndVerifyRadioButton(driver, "color", "yellow");
        }



    private static void clickAndVerifyRadioButton(WebDriver driver, String nameAttribute, String idValue){
        List<WebElement> radioButtons = driver.findElements(By.name(nameAttribute));

        for (WebElement each : radioButtons) {

            String eachID = each.getAttribute("id");
            System.out.println("eachID = " + eachID);

            if (eachID.equals(idValue)) {
                each.click();
                System.out.println(eachID+" is selected: " + each.isSelected());
                break;
            }
        }

    }
}
