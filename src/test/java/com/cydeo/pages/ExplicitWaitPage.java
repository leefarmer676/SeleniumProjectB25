package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExplicitWaitPage {

    public ExplicitWaitPage (){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[.='Remove']")
    public WebElement removeButton;

    @FindBy(id="loading")
    public WebElement loadingBar;

    @FindBy(xpath = "//div[@id='checkbox']")
    public WebElement checkBox;

    @FindBy(xpath = "//p[@id='message']")
    public WebElement itsGoneMessage;



}
