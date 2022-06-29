package com.cydeo.pagesb26;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CydeoPracticePage {

    @FindBy(id="draggable")
    public WebElement smallCircle;
    //make public bc it's in a different package
    //if you don't add an access modifier it'll be default and not accessible from dif package

    @FindBy(id="droptarget")
    public WebElement bigCircle;

    //default constructor will not work for us if we want to use @FindBy
    //must make public constructor
    public CydeoPracticePage(){
        //this constructor will give us access to use FindBy annotation
        PageFactory.initElements(Driver.getDriver(), this);
        //this keyword initializes the object of this class
    }
}
