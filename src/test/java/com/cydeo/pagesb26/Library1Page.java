package com.cydeo.pagesb26;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Library1Page {
    @FindBy (xpath = "//button[@class='btn btn-lg btn-primary btn-block']")
    public WebElement loginBtn;

    @FindBy(id = "inputEmail-error")
    public WebElement errorMsg;

    @FindBy(id="inputEmail")
    public WebElement emailAddressInput;


    public Library1Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
